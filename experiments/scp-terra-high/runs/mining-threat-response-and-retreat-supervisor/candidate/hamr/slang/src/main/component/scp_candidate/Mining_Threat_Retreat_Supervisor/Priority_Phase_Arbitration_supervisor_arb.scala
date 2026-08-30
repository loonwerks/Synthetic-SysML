// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Priority_Phase_Arbitration_supervisor_arb {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Priority_Phase_Arbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_phase_context(Mining_Threat_Retreat_Supervisor.Phase_Context(code(0)))
    api.put_resolved_atomic_result(Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result(
      code(0), code(0), code(0), code(2), code(0), code(0), code(3), code(3), code(2)))
  }

  def timeTriggered(api: Priority_Phase_Arbitration_Operational_Api): Unit = {
    Contract(Modifies(api))
    val phase = api.get_phase_state().get
    val mission = api.get_mission_candidate().get
    val response = api.get_response_candidate().get
    val threat = api.get_threat_publication().get
    val resource = api.get_resource_publication().get
    val fault = api.get_fault().get
    var command: S32 = code(0)
        var nextPhase: S32 = phase.current_phase
        var reason: S32 = code(2)
        if (phase.current_phase == code(0)) {
          if (mission.proposed_reason == code(1)) {
            command = code(1)
            nextPhase = code(1)
            reason = code(1)
          }
        } else if (phase.current_phase == code(1)) {
          if (response.proposed_reason == code(3) || response.proposed_reason == code(4) ||
            response.proposed_reason == code(6)) {
            command = code(5)
            nextPhase = code(3)
            reason = response.proposed_reason
          } else if (response.proposed_reason == code(5)) {
            command = code(4)
            nextPhase = code(2)
            reason = code(5)
          } else if (mission.proposed_reason == code(7) || mission.proposed_reason == code(8)) {
            command = code(5)
            nextPhase = code(3)
            reason = mission.proposed_reason
          } else if (mission.proposed_reason == code(9) || mission.proposed_reason == code(10)) {
            command = code(3)
            nextPhase = code(1)
            reason = mission.proposed_reason
          } else {
            command = code(2)
            nextPhase = code(1)
            reason = code(11)
          }
        } else if (phase.current_phase == code(2)) {
          if (response.proposed_reason == code(12)) {
            command = code(5)
            nextPhase = code(3)
            reason = code(12)
          } else if (response.proposed_reason == code(13)) {
            command = code(4)
            nextPhase = code(2)
            reason = code(13)
          } else if (mission.proposed_reason == code(14)) {
            command = code(2)
            nextPhase = code(1)
            reason = code(14)
          } else {
            command = code(5)
            nextPhase = code(3)
            reason = code(15)
          }
        } else if (phase.current_phase == code(3)) {
          if (response.proposed_reason == code(16)) {
            command = code(6)
            nextPhase = code(4)
            reason = code(16)
          } else {
            command = code(5)
            nextPhase = code(3)
            reason = code(17)
          }
        } else if (phase.current_phase == code(4)) {
          if (mission.proposed_reason == code(19)) {
            command = code(1)
            nextPhase = code(1)
            reason = code(19)
          } else if (mission.proposed_reason == code(20)) {
            command = code(0)
            nextPhase = code(0)
            reason = code(20)
          } else {
            command = code(6)
            nextPhase = code(4)
            reason = code(18)
          }
        }
    api.put_phase_context(Mining_Threat_Retreat_Supervisor.Phase_Context(phase.current_phase))
    api.put_resolved_atomic_result(Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result(
      command, phase.current_phase, nextPhase, reason, fault.fault,
      threat.next_valid_streak, resource.cargo_advisory, resource.capacitor_advisory,
      resource.retreat_advisory))
  }

  def finalise(api: Priority_Phase_Arbitration_Operational_Api): Unit = { }
}
