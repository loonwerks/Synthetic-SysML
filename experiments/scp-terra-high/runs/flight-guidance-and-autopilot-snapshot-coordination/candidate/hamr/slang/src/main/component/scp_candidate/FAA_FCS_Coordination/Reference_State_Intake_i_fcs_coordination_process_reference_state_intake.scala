// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Reference_State_Intake_i_fcs_coordination_process_reference_state_intake {

  def initialise(api: Reference_State_Intake_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Reference_State_Intake_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_reference_state_out(api.get_reference_state_in().get)
  }

  def finalise(api: Reference_State_Intake_i_Operational_Api): Unit = { }
}
