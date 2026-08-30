// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake {

  def initialise(api: AP_Availability_Intake_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: AP_Availability_Intake_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_ap_availability_out(api.get_ap_availability_in().get)
  }

  def finalise(api: AP_Availability_Intake_i_Operational_Api): Unit = { }
}
