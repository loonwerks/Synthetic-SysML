// #Sireum

package faa_autopilot_engagement.FAA_Autopilot_Engagement

import org.sireum._
import faa_autopilot_engagement._

// This file will not be overwritten if HAMR codegen is rerun
object CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery {

  def initialise(api: CSA_Enable_Delivery_Thread_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.ap_on_out == FAA_Autopilot_Engagement.AP_On_Indication.Enabled
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // PART_05 initialisation: establish a safe initial AP-on indication
    api.put_ap_on_out(FAA_Autopilot_Engagement.AP_On_Indication.Enabled)
  }

  def timeTriggered(api: CSA_Enable_Delivery_Thread_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_05_PRESERVE_AP_ON
        //   set AP on out to AP on in
        api.ap_on_out == api.ap_on_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_ap_on_in: Option[FAA_Autopilot_Engagement.AP_On_Indication.Type] = api.get_ap_on_in()
    api.logInfo(s"Received on data port ap_on_in: ${apiUsage_ap_on_in}")

    // PART_05_PRESERVE_AP_ON: set AP on out to AP on in
    api.put_ap_on_out(api.ap_on_in)
  }

  def finalise(api: CSA_Enable_Delivery_Thread_Operational_Api): Unit = { }
}
