// #Sireum

package scp_candidate.Factory_Flow

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier {

  def initialise(api: TargetStepReadinessQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee SafeTargetInitialization
        T
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_targetFact(Factory_Flow.TargetQualification.HeatingReady)
  }

  def timeTriggered(api: TargetStepReadinessQualifier_Operational_Api): Unit = { }

  def finalise(api: TargetStepReadinessQualifier_Operational_Api): Unit = { }
}
