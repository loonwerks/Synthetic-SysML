// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer {

  def initialise(api: ProductionOutcomeDeterminer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_productionOutcome(Factory_Flow.ProductionOutcome.example())
  }

  def timeTriggered(api: ProductionOutcomeDeterminer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_outcomeFact: Option[Factory_Flow.OutcomeFact] = api.get_outcomeFact()
    api.logInfo(s"Received on data port outcomeFact: ${apiUsage_outcomeFact}")
    val apiUsage_appliedSnapshot: Option[Factory_Flow.FlowSnapshot] = api.get_appliedSnapshot()
    api.logInfo(s"Received on data port appliedSnapshot: ${apiUsage_appliedSnapshot}")
  }

  def finalise(api: ProductionOutcomeDeterminer_Operational_Api): Unit = { }
}
