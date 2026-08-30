// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification {

  // BEGIN FUNCTIONS
  @strictpure def qualifyWarehouse(sample: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type = if (sample.status == InputStatus.Invalid) QualifiedWarehouseEvidence.InvalidWarehouseEvidence else if (sample.receipt == WarehouseReceiptEvidence.ReceiptConfirmed) QualifiedWarehouseEvidence.QualifiedReceiptConfirmed else if (sample.receipt == WarehouseReceiptEvidence.ReceiptRejected) QualifiedWarehouseEvidence.QualifiedReceiptRejected else QualifiedWarehouseEvidence.NoQualifiedReceipt
  // END FUNCTIONS

  def initialise(api: WarehouseEvidenceQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_WAREHOUSE_QUALIFICATION
        api.qualifiedWarehouseEvidence == QualifiedWarehouseEvidence.NoQualifiedReceipt
        // END INITIALIZES ENSURES
      )
    )
    api.put_qualifiedWarehouseEvidence(QualifiedWarehouseEvidence.NoQualifiedReceipt)
  }

  def timeTriggered(api: WarehouseEvidenceQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val sample = api.get_warehouseSample().get
    api.put_qualifiedWarehouseEvidence(qualifyWarehouse(sample))
  }

  def finalise(api: WarehouseEvidenceQualification_Operational_Api): Unit = { }
}
