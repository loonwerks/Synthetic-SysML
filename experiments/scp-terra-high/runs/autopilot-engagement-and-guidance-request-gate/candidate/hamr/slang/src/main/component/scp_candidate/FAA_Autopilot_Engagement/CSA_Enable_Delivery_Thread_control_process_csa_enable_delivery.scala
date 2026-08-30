// #Sireum

package scp_candidate.FAA_Autopilot_Engagement

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery {

  def initialise(api: CSA_Enable_Delivery_Thread_Initialization_Api): Unit = {
  }

  def timeTriggered(api: CSA_Enable_Delivery_Thread_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_ap_on_out(api.get_ap_on_in().get)
  }

  def finalise(api: CSA_Enable_Delivery_Thread_Operational_Api): Unit = { }
}
