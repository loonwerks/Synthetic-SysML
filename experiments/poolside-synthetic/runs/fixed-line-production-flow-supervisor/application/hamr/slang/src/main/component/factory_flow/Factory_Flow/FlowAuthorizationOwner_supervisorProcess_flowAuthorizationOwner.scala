// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner {

  def initialise(api: FlowAuthorizationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_authorization(Factory_Flow.AuthorizationFact.example())
    api.put_reasonToStatus(Factory_Flow.DecisionReason.ResetComplete)
  }

  def timeTriggered(api: FlowAuthorizationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_materialFact: Option[Factory_Flow.MaterialFact] = api.get_materialFact()
    api.logInfo(s"Received on data port materialFact: ${apiUsage_materialFact}")
    val apiUsage_targetFact: Option[Factory_Flow.TargetQualification.Type] = api.get_targetFact()
    api.logInfo(s"Received on data port targetFact: ${apiUsage_targetFact}")
    val apiUsage_outcomeFact: Option[Factory_Flow.OutcomeFact] = api.get_outcomeFact()
    api.logInfo(s"Received on data port outcomeFact: ${apiUsage_outcomeFact}")
    val apiUsage_intentFact: Option[Factory_Flow.FlowIntentFact] = api.get_intentFact()
    api.logInfo(s"Received on data port intentFact: ${apiUsage_intentFact}")
  }

  def finalise(api: FlowAuthorizationOwner_Operational_Api): Unit = { }
}
