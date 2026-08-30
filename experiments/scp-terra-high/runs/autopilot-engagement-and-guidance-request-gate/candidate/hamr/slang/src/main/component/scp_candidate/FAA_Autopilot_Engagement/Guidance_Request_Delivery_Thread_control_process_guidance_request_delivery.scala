// #Sireum

package scp_candidate.FAA_Autopilot_Engagement

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery {

  def initialise(api: Guidance_Request_Delivery_Thread_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Guidance_Request_Delivery_Thread_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_request_out(api.get_request_in().get)
  }

  def finalise(api: Guidance_Request_Delivery_Thread_Operational_Api): Unit = { }
}
