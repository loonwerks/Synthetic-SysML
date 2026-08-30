// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake {

  def initialise(api: AP_Availability_Intake_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: AP availability out is Available
        api.ap_availability_out == FAA_FCS_Coordination.AP_Availability.Available
        // END INITIALISE ENSURES
      )
    )
    api.put_ap_availability_out(FAA_FCS_Coordination.AP_Availability.Available)
  }

  def timeTriggered(api: AP_Availability_Intake_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_04_PRESERVE_AP_AVAILABILITY
        //   AP availability out to AP availability in
        api.ap_availability_out == api.ap_availability_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val apiUsage_ap_availability_in: Option[FAA_FCS_Coordination.AP_Availability.Type] = api.get_ap_availability_in()
    api.put_ap_availability_out(apiUsage_ap_availability_in.get)
    api.logInfo(s"Received on data port ap_availability_in: ${apiUsage_ap_availability_in}")
  }

  def finalise(api: AP_Availability_Intake_i_Operational_Api): Unit = { }
}
