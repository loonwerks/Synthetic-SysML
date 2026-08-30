// #Sireum

package scp_candidate.FAA_Autopilot_Engagement

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Status_Reporting_Thread_control_process_status_reporting {

  def initialise(api: Status_Reporting_Thread_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Status_Reporting_Thread_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_status_out(api.get_status_in().get)
  }

  def finalise(api: Status_Reporting_Thread_Operational_Api): Unit = { }
}
