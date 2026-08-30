// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Qualification_supervisor_tq {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Threat_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_threat(Mining_Threat_Retreat_Supervisor.Qualified_Threat(code(0), T, F, F, F))
    api.put_threat_publication(Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts(code(0), code(0)))
    api.put_threat_invalidity(Mining_Threat_Retreat_Supervisor.Threat_Invalidity(F))
  }

  def timeTriggered(api: Threat_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val raw = api.get_raw_threat().get
    val streakState = api.get_streak_state().get
    val invalid = raw.threat_validity == code(1)
    var nextStreak: S32 = code(2)
    if (invalid) {
      nextStreak = code(0)
    } else if (streakState.current_valid_streak == code(0)) {
      nextStreak = code(1)
    }
    var qualified: S32 = raw.threat + code(1)
    if (invalid || nextStreak != code(2)) {
      qualified = code(0)
    }
    api.put_qualified_threat(Mining_Threat_Retreat_Supervisor.Qualified_Threat(
      qualified, qualified == code(0), qualified == code(1) || qualified == code(2),
      qualified == code(3), qualified == code(4)))
    api.put_threat_publication(Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts(
      qualified, nextStreak))
    api.put_threat_invalidity(Mining_Threat_Retreat_Supervisor.Threat_Invalidity(invalid))
  }

  def finalise(api: Threat_Qualification_Operational_Api): Unit = { }
}
