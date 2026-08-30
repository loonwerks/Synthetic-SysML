// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake {

  def initialise(api: Attitude_Condition_Intake_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: attitude data out Valid, attitude acceptable out Acceptable
        api.attitude_data_out == FAA_FCS_Coordination.Attitude_Data_Validity.Valid,
        api.attitude_acceptable_out == FAA_FCS_Coordination.Attitude_Acceptability.Acceptable
        // END INITIALISE ENSURES
      )
    )
    api.put_attitude_data_out(FAA_FCS_Coordination.Attitude_Data_Validity.Valid)
    api.put_attitude_acceptable_out(FAA_FCS_Coordination.Attitude_Acceptability.Acceptable)
  }

  def timeTriggered(api: Attitude_Condition_Intake_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_02_PRESERVE_ATTITUDE_DATA
        //   attitude data out to attitude data in
        api.attitude_data_out == api.attitude_data_in,
        // guarantee PART_02_PRESERVE_ATTITUDE_ACCEPTABILITY
        //   attitude acceptable out to attitude acceptable in
        api.attitude_acceptable_out == api.attitude_acceptable_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val apiUsage_attitude_data_in: Option[FAA_FCS_Coordination.Attitude_Data_Validity.Type] = api.get_attitude_data_in()
    val apiUsage_attitude_acceptable_in: Option[FAA_FCS_Coordination.Attitude_Acceptability.Type] = api.get_attitude_acceptable_in()
    api.put_attitude_data_out(apiUsage_attitude_data_in.get)
    api.put_attitude_acceptable_out(apiUsage_attitude_acceptable_in.get)
    api.logInfo(s"Received on data port attitude_data_in: ${apiUsage_attitude_data_in}")
    api.logInfo(s"Received on data port attitude_acceptable_in: ${apiUsage_attitude_acceptable_in}")
  }

  def finalise(api: Attitude_Condition_Intake_i_Operational_Api): Unit = { }
}
