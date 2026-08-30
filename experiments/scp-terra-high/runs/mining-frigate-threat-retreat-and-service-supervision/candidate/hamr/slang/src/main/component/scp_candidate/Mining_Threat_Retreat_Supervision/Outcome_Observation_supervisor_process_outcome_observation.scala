// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Outcome_Observation_supervisor_process_outcome_observation {

  def initialise(api: Outcome_Observation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_action_outcome(Mining_Threat_Retreat_Supervision.ActionOutcomeValue(s32"0"))
  }

  def timeTriggered(api: Outcome_Observation_Operational_Api): Unit = { }

  def finalise(api: Outcome_Observation_Operational_Api): Unit = { }
}
