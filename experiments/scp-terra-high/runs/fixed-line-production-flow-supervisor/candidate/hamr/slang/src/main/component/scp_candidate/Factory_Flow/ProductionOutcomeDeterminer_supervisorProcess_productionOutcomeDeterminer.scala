// #Sireum

package scp_candidate.Factory_Flow

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer {

  def initialise(api: ProductionOutcomeDeterminer_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee SafeOutcomeOutputInitialization
        T
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_productionOutcome(Factory_Flow.ProductionOutcome.example())
  }

  def timeTriggered(api: ProductionOutcomeDeterminer_Operational_Api): Unit = { }

  def finalise(api: ProductionOutcomeDeterminer_Operational_Api): Unit = { }
}
