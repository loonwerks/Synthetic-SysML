// #Sireum

package scp_candidate.Drone_Battery_Charge_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Context_Qualification_charge_supervision_process_charge_context_qualification {

  def initialise(api: Charge_Context_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)
  }

  def timeTriggered(api: Charge_Context_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: Charge_Context_Qualification_Operational_Api): Unit = { }
}
