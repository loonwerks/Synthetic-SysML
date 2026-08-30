// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Intent_Acquisition_supervisor_process_intent_acquisition {

  def initialise(api: Intent_Acquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val intent = Mining_Threat_Retreat_Supervision.IntentValue(s32"0")
    api.put_intent_recovery(intent)
    api.put_intent_mining(intent)
    api.put_intent_defense(intent)
    api.put_intent_mobility(intent)
  }

  def timeTriggered(api: Intent_Acquisition_Operational_Api): Unit = { }

  def finalise(api: Intent_Acquisition_Operational_Api): Unit = { }
}
