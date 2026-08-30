// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification {

  def initialise(api: WarehouseEvidenceQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedWarehouseEvidence(Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.InvalidWarehouseEvidence)
  }

  def timeTriggered(api: WarehouseEvidenceQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_warehouseSample: Option[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample] = api.get_warehouseSample()
    api.logInfo(s"Received on data port warehouseSample: ${apiUsage_warehouseSample}")
  }

  def finalise(api: WarehouseEvidenceQualification_Operational_Api): Unit = { }
}
