// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TransferDecisionOwner_supervisionProcess_transferDecisionOwner {

  def initialise(api: TransferDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_commandResolution(Mining_Cargo_Transfer_Supervisor.TransferResolution.example())
    api.put_reportResolution(Mining_Cargo_Transfer_Supervisor.TransferResolution.example())
  }

  def timeTriggered(api: TransferDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualifiedRequest: Option[Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type] = api.get_qualifiedRequest()
    api.logInfo(s"Received on data port qualifiedRequest: ${apiUsage_qualifiedRequest}")
    val apiUsage_dockingAssessment: Option[Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type] = api.get_dockingAssessment()
    api.logInfo(s"Received on data port dockingAssessment: ${apiUsage_dockingAssessment}")
    val apiUsage_qualifiedShipProgress: Option[Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type] = api.get_qualifiedShipProgress()
    api.logInfo(s"Received on data port qualifiedShipProgress: ${apiUsage_qualifiedShipProgress}")
    val apiUsage_qualifiedWarehouseEvidence: Option[Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type] = api.get_qualifiedWarehouseEvidence()
    api.logInfo(s"Received on data port qualifiedWarehouseEvidence: ${apiUsage_qualifiedWarehouseEvidence}")
  }

  def finalise(api: TransferDecisionOwner_Operational_Api): Unit = { }
}
