// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy {

  def initialise(api: PowerChargeCommandPolicy_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.POWER_OFF)
    api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
  }

  def timeTriggered(api: PowerChargeCommandPolicy_Operational_Api): Unit = {
    // example api usage

    val apiUsage_decisionSnapshot: Option[Drone_Lifecycle_Governor.DecisionSnapshot] = api.get_decisionSnapshot()
    api.logInfo(s"Received on data port decisionSnapshot: ${apiUsage_decisionSnapshot}")
  }

  def finalise(api: PowerChargeCommandPolicy_Operational_Api): Unit = { }
}
