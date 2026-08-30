// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Priority_Arbitration_supervisor_process_priority_arbitration {

  def initialise(api: Priority_Arbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_selected_action(Mining_Threat_Retreat_Supervision.ActionValue(s32"0"))
    api.put_selected_cause(Mining_Threat_Retreat_Supervision.SelectedCauseValue(s32"5"))
  }

  def timeTriggered(api: Priority_Arbitration_Operational_Api): Unit = {
    Contract(Modifies(api))
    val emergency = api.get_emergency_state().get
    val mining = api.get_mining_proposal().get
    val defense = api.get_defense_proposal().get
    val mobility = api.get_mobility_proposal().get
    val action: S32 =
      if (emergency.emergency_code == s32"1") s32"0"
      else if (mobility.proposal_code == s32"1") s32"3"
      else if (defense.proposal_code == s32"1") s32"2"
      else if (mobility.proposal_code == s32"2") s32"4"
      else if (mining.proposal_code == s32"1") s32"1"
      else s32"0"
    val cause: S32 =
      if (emergency.emergency_code == s32"1") s32"0"
      else if (mobility.proposal_code == s32"1") s32"1"
      else if (defense.proposal_code == s32"1") s32"2"
      else if (mobility.proposal_code == s32"2") s32"3"
      else if (mining.proposal_code == s32"1") s32"4"
      else s32"5"
    api.put_selected_action(Mining_Threat_Retreat_Supervision.ActionValue(action))
    api.put_selected_cause(Mining_Threat_Retreat_Supervision.SelectedCauseValue(cause))
  }

  def finalise(api: Priority_Arbitration_Operational_Api): Unit = { }
}
