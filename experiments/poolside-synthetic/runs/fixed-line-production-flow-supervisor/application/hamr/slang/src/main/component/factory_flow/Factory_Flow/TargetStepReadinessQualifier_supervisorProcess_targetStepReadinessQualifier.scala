// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier {

  def initialise(api: TargetStepReadinessQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_targetFact(Factory_Flow.TargetQualification.HeatingReady)
  }

  def timeTriggered(api: TargetStepReadinessQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_readinessObservation: Option[Factory_Flow.StepReadinessObservation] = api.get_readinessObservation()
    api.logInfo(s"Received on data port readinessObservation: ${apiUsage_readinessObservation}")
    val apiUsage_flowContext: Option[Factory_Flow.FlowContext] = api.get_flowContext()
    api.logInfo(s"Received on data port flowContext: ${apiUsage_flowContext}")
  }

  def finalise(api: TargetStepReadinessQualifier_Operational_Api): Unit = { }
}
