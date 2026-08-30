// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Fault_Assessment_supervisor_fa {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Fault_Assessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_fault(Mining_Threat_Retreat_Supervisor.Fault_Fact(code(0)))
  }

  def timeTriggered(api: Fault_Assessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val mission = api.get_mission_invalidity().get
    val threat = api.get_threat_invalidity().get
    val resource = api.get_resource_invalidity().get
    val phase = api.get_phase_context().get
    val phaseRelevantInvalidity =
      (phase.current_phase == code(3) && mission.arrival_invalid) ||
      ((phase.current_phase == code(0) || phase.current_phase == code(4)) && mission.resupply_invalid)
    val asserted = threat.threat_invalid || resource.resource_invalid ||
      mission.intent_invalid || phaseRelevantInvalidity
    var fault: S32 = code(0)
    if (asserted) {
      fault = code(1)
    }
    api.put_fault(Mining_Threat_Retreat_Supervisor.Fault_Fact(fault))
  }

  def finalise(api: Fault_Assessment_Operational_Api): Unit = { }
}
