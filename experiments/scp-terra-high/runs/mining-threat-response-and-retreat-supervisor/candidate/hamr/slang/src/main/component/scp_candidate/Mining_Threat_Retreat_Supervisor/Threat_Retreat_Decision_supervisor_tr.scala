// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Retreat_Decision_supervisor_tr {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Threat_Retreat_Decision_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_response_proposal(Mining_Threat_Retreat_Supervisor.Response_Proposal(code(0)))
  }

  def timeTriggered(api: Threat_Retreat_Decision_Operational_Api): Unit = {
    Contract(Modifies(api))
    val phase = api.get_phase_context().get
    val threat = api.get_threat_fact().get
    val defense = api.get_defense_facts().get
    val arrival = api.get_arrival_fact().get
    var reason: S32 = code(0)
        if (phase.current_phase == code(1)) {
          if (threat.untrusted) {
            reason = code(3)
          } else if (threat.severe) {
            reason = code(4)
          } else if (threat.hostile && defense.defense_ready) {
            reason = code(5)
          } else if (threat.hostile) {
            reason = code(6)
          }
        } else if (phase.current_phase == code(2)) {
          if (threat.untrusted || threat.severe || !defense.defense_ready) {
            reason = code(12)
          } else if (threat.hostile) {
            reason = code(13)
          } else {
            reason = code(15)
          }
        } else if (phase.current_phase == code(3)) {
          if (arrival.valid_safe_at_station) {
            reason = code(16)
          } else {
            reason = code(17)
          }
        }
    api.put_response_proposal(Mining_Threat_Retreat_Supervisor.Response_Proposal(reason))
  }

  def finalise(api: Threat_Retreat_Decision_Operational_Api): Unit = { }
}
