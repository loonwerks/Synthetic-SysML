// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Recovery_Control_supervisor_process_recovery_control {

  // BEGIN STATE VARS
  var recovery_memory: Base_Types.Integer_32 = Base_Types.Integer_32_example()
  // END STATE VARS

  def initialise(api: Recovery_Control_Initialization_Api): Unit = {
    Contract(
      Modifies(api, recovery_memory),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee healthy_initial
        recovery_memory == 0 &
          api.next_recovery_state.state_code == 0 &
          api.gate_mining.gate_code == 0 &
          api.gate_defense == api.gate_mining &
          api.gate_mobility == api.gate_mining &
          api.emergency_state.emergency_code == 0
        // END INITIALIZES ENSURES
      )
    )
    recovery_memory = s32"0"
    val gate = Mining_Threat_Retreat_Supervision.RecoveryGateValue(s32"0")
    api.put_gate_mining(gate)
    api.put_gate_defense(gate)
    api.put_gate_mobility(gate)
    api.put_emergency_state(Mining_Threat_Retreat_Supervision.EmergencyStateValue(s32"0"))
    api.put_next_recovery_state(Mining_Threat_Retreat_Supervision.RecoveryStateValue(s32"0"))
  }

  def timeTriggered(api: Recovery_Control_Operational_Api): Unit = {
    Contract(Modifies(api, recovery_memory))
    val intent = api.get_intent().get
    val outcome = api.get_action_outcome().get
    val validity = api.get_threat_validity().get
    val next: S32 =
      if (validity.validity_code == s32"0" | outcome.outcome_code == s32"6") s32"1"
      else if (recovery_memory == s32"0") s32"0"
      else if (recovery_memory == s32"1" & intent.intent_code == s32"4") s32"2"
      else if (recovery_memory == s32"2" & intent.intent_code == s32"0" &
        outcome.outcome_code == s32"1") s32"0"
      else recovery_memory
    recovery_memory = next
    val gateCode: S32 = if (next == s32"0") s32"0" else s32"1"
    val gate = Mining_Threat_Retreat_Supervision.RecoveryGateValue(gateCode)
    api.put_gate_mining(gate)
    api.put_gate_defense(gate)
    api.put_gate_mobility(gate)
    api.put_emergency_state(Mining_Threat_Retreat_Supervision.EmergencyStateValue(gateCode))
    api.put_next_recovery_state(Mining_Threat_Retreat_Supervision.RecoveryStateValue(next))
  }

  def finalise(api: Recovery_Control_Operational_Api): Unit = { }
}
