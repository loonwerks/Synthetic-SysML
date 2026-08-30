// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result {

  def initialise(api: Mission_Mode_And_Public_Result_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee healthy_hold
        api.public_result.selected_action == 0 &
          api.public_result.selected_cause == 5 &
          api.public_result.mode == 0 &
          api.public_result.recovery_state == 0
        // END INITIALIZES ENSURES
      )
    )
    api.put_public_result(Mining_Threat_Retreat_Supervision.PublicResultValue(s32"0", s32"5", s32"0", s32"0"))
  }

  def timeTriggered(api: Mission_Mode_And_Public_Result_Operational_Api): Unit = {
    Contract(Modifies(api))
    val action = api.get_selected_action().get
    val cause = api.get_selected_cause().get
    val recovery = api.get_next_recovery_state().get
    val mode: S32 =
      if (recovery.state_code != s32"0") s32"5"
      else if (action.action_code == s32"0") s32"0"
      else if (action.action_code == s32"1") s32"1"
      else if (action.action_code == s32"2") s32"2"
      else if (action.action_code == s32"3") s32"3"
      else if (action.action_code == s32"4") s32"4"
      else s32"5"
    api.put_public_result(Mining_Threat_Retreat_Supervision.PublicResultValue(
      action.action_code, cause.cause_code, mode, recovery.state_code))
  }

  def finalise(api: Mission_Mode_And_Public_Result_Operational_Api): Unit = { }
}
