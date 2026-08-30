// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Personnel_Mission_Qualification_supervisor_pq {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Personnel_Mission_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mission_facts(Mining_Threat_Retreat_Supervisor.Mission_Facts(F, F, F, F, F))
    api.put_arrival_fact(Mining_Threat_Retreat_Supervisor.Arrival_Fact(F))
    api.put_mission_invalidity(Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts(F, F, F))
  }

  def timeTriggered(api: Personnel_Mission_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val raw = api.get_raw_mission().get
    val intentInvalid = raw.intent_validity == code(1)
    api.put_mission_facts(Mining_Threat_Retreat_Supervisor.Mission_Facts(
      raw.intent_validity == code(0) && raw.pilot_intent == code(0),
      intentInvalid || raw.pilot_intent == code(2),
      raw.intent_validity == code(0) && (raw.pilot_intent == code(1) || raw.pilot_intent == code(2)),
      raw.resupply_validity == code(0) && raw.resupply == code(1),
      intentInvalid))
    api.put_arrival_fact(Mining_Threat_Retreat_Supervisor.Arrival_Fact(
      raw.arrival_validity == code(0) && raw.arrival == code(1)))
    api.put_mission_invalidity(Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts(
      intentInvalid, raw.arrival_validity == code(1), raw.resupply_validity == code(1)))
  }

  def finalise(api: Personnel_Mission_Qualification_Operational_Api): Unit = { }
}
