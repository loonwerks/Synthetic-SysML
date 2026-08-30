// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ShipProgressQualification_supervisionProcess_shipProgressQualification {

  def initialise(api: ShipProgressQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedShipProgress(Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.InvalidShipProgress)
  }

  def timeTriggered(api: ShipProgressQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_shipSample: Option[Mining_Cargo_Transfer_Supervisor.ShipTransferSample] = api.get_shipSample()
    api.logInfo(s"Received on data port shipSample: ${apiUsage_shipSample}")
  }

  def finalise(api: ShipProgressQualification_Operational_Api): Unit = { }
}
