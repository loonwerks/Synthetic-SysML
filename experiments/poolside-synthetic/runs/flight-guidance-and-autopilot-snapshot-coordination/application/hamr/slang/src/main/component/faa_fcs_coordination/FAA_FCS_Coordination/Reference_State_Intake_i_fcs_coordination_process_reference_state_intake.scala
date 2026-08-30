// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object Reference_State_Intake_i_fcs_coordination_process_reference_state_intake {

  def initialise(api: Reference_State_Intake_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: reference state out Synchronized
        api.reference_state_out == FAA_FCS_Coordination.Reference_State.Synchronized
        // END INITIALISE ENSURES
      )
    )
    api.put_reference_state_out(FAA_FCS_Coordination.Reference_State.Synchronized)
  }

  def timeTriggered(api: Reference_State_Intake_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_03_PRESERVE_REFERENCE_STATE
        //   reference state out to reference state in
        api.reference_state_out == api.reference_state_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val apiUsage_reference_state_in: Option[FAA_FCS_Coordination.Reference_State.Type] = api.get_reference_state_in()
    api.put_reference_state_out(apiUsage_reference_state_in.get)
    api.logInfo(s"Received on data port reference_state_in: ${apiUsage_reference_state_in}")
  }

  def finalise(api: Reference_State_Intake_i_Operational_Api): Unit = { }
}
