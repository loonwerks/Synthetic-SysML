// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy {

  def initialise(api: PowerChargeCommandPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initialPower
        api.powerCommand == PowerCommand.POWER_OFF,
        // guarantee initialCharge
        api.chargeCommand == ChargeCommand.CHARGE_DISABLED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.POWER_OFF)
    api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
  }

  def timeTriggered(api: PowerChargeCommandPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_decisionSnapshot() match {
      case Some(snapshot) =>
        snapshot.nextState match {
          case Drone_Lifecycle_Governor.DecisionNextState.CHARGING =>
            api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.POWER_OFF)
            api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_ENABLED)
          case Drone_Lifecycle_Governor.DecisionNextState.FLYING =>
            api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.FLIGHT_POWER)
            api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
          case Drone_Lifecycle_Governor.DecisionNextState.STANDBY =>
            api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.SUPPORT_POWER)
            api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
          case Drone_Lifecycle_Governor.DecisionNextState.READY =>
            api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.SUPPORT_POWER)
            api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
          case _ =>
            api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.POWER_OFF)
            api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
        }
    }
  }

  def finalise(api: PowerChargeCommandPolicy_Operational_Api): Unit = { }
}
