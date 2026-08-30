// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Intent_Acquisition_supervisor_process_intent_acquisition {

  def initialise(api: Intent_Acquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_intent_recovery(Mining_Threat_Retreat_Supervision.IntentValue.example())
    api.put_intent_mining(Mining_Threat_Retreat_Supervision.IntentValue.example())
    api.put_intent_defense(Mining_Threat_Retreat_Supervision.IntentValue.example())
    api.put_intent_mobility(Mining_Threat_Retreat_Supervision.IntentValue.example())
  }

  def timeTriggered(api: Intent_Acquisition_Operational_Api): Unit = {
    // example api usage


  }

  def finalise(api: Intent_Acquisition_Operational_Api): Unit = { }
}
