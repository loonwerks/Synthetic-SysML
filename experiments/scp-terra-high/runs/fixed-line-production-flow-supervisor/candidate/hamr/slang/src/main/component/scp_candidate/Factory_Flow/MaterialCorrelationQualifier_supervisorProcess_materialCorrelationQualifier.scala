// #Sireum

package scp_candidate.Factory_Flow

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier {

  def initialise(api: MaterialCorrelationQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee SafeMaterialInitialization
        T
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_materialFact(Factory_Flow.MaterialFact.example())
  }

  def timeTriggered(api: MaterialCorrelationQualifier_Operational_Api): Unit = { }

  def finalise(api: MaterialCorrelationQualifier_Operational_Api): Unit = { }
}
