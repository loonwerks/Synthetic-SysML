// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object IntentQualifier_supervisorProcess_intentQualifier {

  def initialise(api: IntentQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INTENT_INITIAL_SAFE
        api.qualifiedIntent == QualifiedIntent.NO_ACTION
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedIntent(Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.NO_ACTION)
  }

  def timeTriggered(api: IntentQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val intent: PilotIntent.Type = api.get_pilotIntent().get
    var qualified: QualifiedIntent.Type = QualifiedIntent.NO_ACTION
    if (intent == PilotIntent.FRESH_DOCK) {
      qualified = QualifiedIntent.DOCK_REQUEST
    } else if (intent == PilotIntent.FRESH_UNDOCK) {
      qualified = QualifiedIntent.UNDOCK_REQUEST
    } else if (intent == PilotIntent.FRESH_RESET) {
      qualified = QualifiedIntent.RESET_REQUEST
    } else if (intent == PilotIntent.INVALID) {
      qualified = QualifiedIntent.INTENT_FAULT
    }
    api.put_qualifiedIntent(qualified)
  }

  def finalise(api: IntentQualifier_Operational_Api): Unit = { }
}
