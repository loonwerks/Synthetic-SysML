// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Mission_Recovery_Decision_supervisor_mr {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Mission_Recovery_Decision_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mission_proposal(Mining_Threat_Retreat_Supervisor.Mission_Proposal(code(0)))
  }

  def timeTriggered(api: Mission_Recovery_Decision_Operational_Api): Unit = {
    Contract(Modifies(api))
    val phase = api.get_phase_context().get
    val threat = api.get_threat_fact().get
    val resource = api.get_resource_facts().get
    val mission = api.get_mission_facts().get
    var reason: S32 = code(0)
        if (phase.current_phase == code(0)) {
          if (threat.acceptable && resource.mine_ready && resource.resource_reset &&
            mission.valid_complete_resupply && mission.valid_mine) {
            reason = code(1)
          } else {
            reason = code(2)
          }
        } else if (phase.current_phase == code(1)) {
          if (mission.invalid_or_return) {
            reason = code(7)
          } else if (resource.cargo_or_capacitor_retreat) {
            reason = code(8)
          } else if (resource.target_or_mining_block) {
            reason = code(9)
          } else if (mission.valid_hold_or_return) {
            reason = code(10)
          } else {
            reason = code(11)
          }
        } else if (phase.current_phase == code(2)) {
          if (threat.acceptable && resource.mine_ready && mission.valid_mine) {
            reason = code(14)
          }
        } else if (phase.current_phase == code(4)) {
          if (!threat.acceptable || mission.intent_invalid ||
            !(resource.resource_reset && mission.valid_complete_resupply)) {
            reason = code(18)
          } else if (mission.valid_mine) {
            reason = code(19)
          } else if (mission.valid_hold_or_return) {
            reason = code(20)
          } else {
            reason = code(18)
          }
        }
    api.put_mission_proposal(Mining_Threat_Retreat_Supervisor.Mission_Proposal(reason))
  }

  def finalise(api: Mission_Recovery_Decision_Operational_Api): Unit = { }
}
