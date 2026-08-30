// #Sireum

package faa_autopilot_engagement.FAA_Autopilot_Engagement

import org.sireum._
import faa_autopilot_engagement._

// This file will not be overwritten if HAMR codegen is rerun
object Status_Reporting_Thread_control_process_status_reporting {

  def initialise(api: Status_Reporting_Thread_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.status_out == FAA_Autopilot_Engagement.AP_Status.Failed
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // PART_04 initialisation: establish a safe initial AP status
    api.put_status_out(FAA_Autopilot_Engagement.AP_Status.Failed)
  }

  def timeTriggered(api: Status_Reporting_Thread_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_04_PRESERVE_AP_STATUS
        //   set status out to status in
        api.status_out == api.status_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_status_in: Option[FAA_Autopilot_Engagement.AP_Status.Type] = api.get_status_in()
    api.logInfo(s"Received on data port status_in: ${apiUsage_status_in}")

    // PART_04_PRESERVE_AP_STATUS: set status out to status in
    api.put_status_out(api.status_in)
  }

  def finalise(api: Status_Reporting_Thread_Operational_Api): Unit = { }
}
