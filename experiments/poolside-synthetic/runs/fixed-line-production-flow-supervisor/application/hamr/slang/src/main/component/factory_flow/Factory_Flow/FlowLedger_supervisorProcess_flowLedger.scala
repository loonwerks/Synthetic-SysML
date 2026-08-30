// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object FlowLedger_supervisorProcess_flowLedger {

  def initialise(api: FlowLedger_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_contextToReadiness(Factory_Flow.FlowContext.example())
    api.put_contextToOutcome(Factory_Flow.FlowContext.example())
    api.put_protectionContext(Factory_Flow.ProtectionContext.example())
    api.put_snapshotToOutcome(Factory_Flow.FlowSnapshot.example())
    api.put_snapshotToStatus(Factory_Flow.FlowSnapshot.example())
    api.put_lineCommand(Factory_Flow.LineFlowCommand.example())
  }

  def timeTriggered(api: FlowLedger_Operational_Api): Unit = {
    // example api usage

    val apiUsage_authorization: Option[Factory_Flow.AuthorizationFact] = api.get_authorization()
    api.logInfo(s"Received on data port authorization: ${apiUsage_authorization}")
  }

  def finalise(api: FlowLedger_Operational_Api): Unit = { }
}
