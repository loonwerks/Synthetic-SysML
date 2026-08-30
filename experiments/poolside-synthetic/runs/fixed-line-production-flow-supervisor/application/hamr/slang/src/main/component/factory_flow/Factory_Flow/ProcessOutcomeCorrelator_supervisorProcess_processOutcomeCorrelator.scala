// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator {

  def initialise(api: ProcessOutcomeCorrelator_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_outcomeToAuthorization(Factory_Flow.OutcomeFact.example())
    api.put_outcomeToDeterminer(Factory_Flow.OutcomeFact.example())
  }

  def timeTriggered(api: ProcessOutcomeCorrelator_Operational_Api): Unit = {
    // example api usage

    val apiUsage_processResult: Option[Factory_Flow.ProcessResultObservation] = api.get_processResult()
    api.logInfo(s"Received on data port processResult: ${apiUsage_processResult}")
    val apiUsage_flowContext: Option[Factory_Flow.FlowContext] = api.get_flowContext()
    api.logInfo(s"Received on data port flowContext: ${apiUsage_flowContext}")
  }

  def finalise(api: ProcessOutcomeCorrelator_Operational_Api): Unit = { }
}
