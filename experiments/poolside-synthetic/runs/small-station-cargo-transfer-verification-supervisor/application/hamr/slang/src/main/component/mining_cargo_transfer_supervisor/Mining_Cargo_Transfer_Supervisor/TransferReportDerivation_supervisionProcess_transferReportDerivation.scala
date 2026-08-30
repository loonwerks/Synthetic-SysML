// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TransferReportDerivation_supervisionProcess_transferReportDerivation {

  def initialise(api: TransferReportDerivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supervisorStatus(Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Ready)
    api.put_verificationFinding(Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.NotEstablished)
  }

  def timeTriggered(api: TransferReportDerivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_resolution: Option[Mining_Cargo_Transfer_Supervisor.TransferResolution] = api.get_resolution()
    api.logInfo(s"Received on data port resolution: ${apiUsage_resolution}")
  }

  def finalise(api: TransferReportDerivation_Operational_Api): Unit = { }
}
