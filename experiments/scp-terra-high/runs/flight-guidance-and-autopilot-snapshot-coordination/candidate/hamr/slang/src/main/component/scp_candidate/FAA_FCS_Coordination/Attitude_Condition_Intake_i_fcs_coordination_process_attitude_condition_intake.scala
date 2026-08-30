// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake {

  def initialise(api: Attitude_Condition_Intake_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Attitude_Condition_Intake_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_attitude_data_out(api.get_attitude_data_in().get)
    api.put_attitude_acceptable_out(api.get_attitude_acceptable_in().get)
  }

  def finalise(api: Attitude_Condition_Intake_i_Operational_Api): Unit = { }
}
