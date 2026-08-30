// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualification_supervisionProcess_requestQualification {

  def initialise(api: RequestQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedRequest(Mining_Cargo_Transfer_Supervisor.QualifiedRequest.InvalidRequest)
  }

  def timeTriggered(api: RequestQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestSample: Option[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample] = api.get_requestSample()
    api.logInfo(s"Received on data port requestSample: ${apiUsage_requestSample}")
  }

  def finalise(api: RequestQualification_Operational_Api): Unit = { }
}
