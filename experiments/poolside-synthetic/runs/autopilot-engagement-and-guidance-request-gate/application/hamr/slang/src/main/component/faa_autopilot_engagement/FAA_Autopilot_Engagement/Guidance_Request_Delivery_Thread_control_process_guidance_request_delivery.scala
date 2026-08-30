// #Sireum

package faa_autopilot_engagement.FAA_Autopilot_Engagement

import org.sireum._
import faa_autopilot_engagement._

// This file will not be overwritten if HAMR codegen is rerun
object Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery {

  def initialise(api: Guidance_Request_Delivery_Thread_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.request_out == FAA_Autopilot_Engagement.AP_Guidance_Request.Requested
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // PART_03 initialisation: establish a safe initial guidance request
    api.put_request_out(FAA_Autopilot_Engagement.AP_Guidance_Request.Requested)
  }

  def timeTriggered(api: Guidance_Request_Delivery_Thread_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_03_PRESERVE_GUIDANCE_REQUEST
        //   set request out to request in
        api.request_out == api.request_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_request_in: Option[FAA_Autopilot_Engagement.AP_Guidance_Request.Type] = api.get_request_in()
    api.logInfo(s"Received on data port request_in: ${apiUsage_request_in}")

    // PART_03_PRESERVE_GUIDANCE_REQUEST: set request out to request in
    api.put_request_out(api.request_in)
  }

  def finalise(api: Guidance_Request_Delivery_Thread_Operational_Api): Unit = { }
}
