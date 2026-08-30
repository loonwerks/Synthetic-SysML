// #Sireum

package scp_candidate.Station_Cargo_Transfer_Verification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier {

  def initialise(api: WarehouseEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee WAREHOUSE_FINDING_INITIAL
        api.warehouseFinding == WarehouseFinding.Neutral
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_warehouseFinding(Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Neutral)
  }

  def timeTriggered(api: WarehouseEvidenceQualifier_Operational_Api): Unit = { }
  def finalise(api: WarehouseEvidenceQualifier_Operational_Api): Unit = { }
}
