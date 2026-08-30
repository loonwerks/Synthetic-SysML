// #Sireum

package equiv_shared_0.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import equiv_shared_0._

object WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification {
  // BEGIN FUNCTIONS
  @strictpure def qualifyWarehouse(sample: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type = if (sample.status == InputStatus.Invalid) QualifiedWarehouseEvidence.InvalidWarehouseEvidence else if (sample.receipt == WarehouseReceiptEvidence.ReceiptConfirmed) QualifiedWarehouseEvidence.QualifiedReceiptConfirmed else if (sample.receipt == WarehouseReceiptEvidence.ReceiptRejected) QualifiedWarehouseEvidence.QualifiedReceiptRejected else QualifiedWarehouseEvidence.NoQualifiedReceipt
  // END FUNCTIONS
}
