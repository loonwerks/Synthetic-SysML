// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BerthCommitment_supervisor_process_berth_commitment {

  def initialise(api: BerthCommitment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_berth_state(Docking_Access_Supervisor.BerthState.AVAILABLE)
  }

  def timeTriggered(api: BerthCommitment_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_berth_state(Docking_Access_Supervisor.BerthState.AVAILABLE)
  }

  def finalise(api: BerthCommitment_Operational_Api): Unit = { }
}
