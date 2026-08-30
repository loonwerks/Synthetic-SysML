// #Sireum

package scp_candidate.Factory_Flow

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner {

  def initialise(api: FlowAuthorizationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee SafeAuthorizationInitialization
        T
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_authorization(Factory_Flow.AuthorizationFact.example())
    api.put_reasonToStatus(Factory_Flow.DecisionReason.ResetComplete)
  }

  def timeTriggered(api: FlowAuthorizationOwner_Operational_Api): Unit = { }

  def finalise(api: FlowAuthorizationOwner_Operational_Api): Unit = { }
}
