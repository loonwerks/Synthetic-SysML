// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Atomic_Publication_supervisor_ap {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Atomic_Publication_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_publication(Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result(
      code(0), code(0), code(0), code(2), code(0), code(0), code(3), code(3), code(2), code(1), code(0)))
  }

  def timeTriggered(api: Atomic_Publication_Operational_Api): Unit = {
    Contract(Modifies(api))
    val result = api.get_atomic_result().get
    var laser: S32 = code(1)
    var drones: S32 = code(0)
    if (result.command == code(2)) {
      laser = code(0)
      drones = code(1)
    } else if (result.command == code(4)) {
      drones = code(2)
    }
    api.put_publication(Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result(
      result.command, result.current_phase, result.next_phase, result.reason,
      result.fault, result.next_valid_streak, result.cargo_advisory,
      result.capacitor_advisory, result.retreat_advisory, laser, drones))
  }

  def finalise(api: Atomic_Publication_Operational_Api): Unit = { }
}
