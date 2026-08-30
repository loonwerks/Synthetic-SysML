// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceAccessGate_supervisor_process_service_access_gate {

  def initialise(api: ServiceAccessGate_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_gate_state(Docking_Access_Supervisor.GateState.CLOSED)
  }

  def timeTriggered(api: ServiceAccessGate_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_gate_state(Docking_Access_Supervisor.GateState.CLOSED)
  }

  def finalise(api: ServiceAccessGate_Operational_Api): Unit = { }
}
