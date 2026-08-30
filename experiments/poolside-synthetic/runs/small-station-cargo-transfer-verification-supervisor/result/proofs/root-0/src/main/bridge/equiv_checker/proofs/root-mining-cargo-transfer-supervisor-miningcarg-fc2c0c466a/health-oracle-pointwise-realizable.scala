// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_fc2c0c466a11_Oracle_Pointwise_Realizable {
  @pure def check(
      warehousesample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_GumboX.compute_CEP_Post(warehousesample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.InvalidWarehouseEvidence)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_GumboX.compute_CEP_Post(warehousesample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.NoQualifiedReceipt)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_GumboX.compute_CEP_Post(warehousesample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.QualifiedReceiptConfirmed)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_GumboX.compute_CEP_Post(warehousesample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.QualifiedReceiptRejected)))))
  }
}
