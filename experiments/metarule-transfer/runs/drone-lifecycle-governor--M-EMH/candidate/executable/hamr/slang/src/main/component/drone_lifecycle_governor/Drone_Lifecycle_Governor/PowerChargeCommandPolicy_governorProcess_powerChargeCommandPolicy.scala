// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy {

  def initialise(api: PowerChargeCommandPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_powerCommand(Drone_Lifecycle_Governor.PowerCommand.POWER_OFF)
    api.put_chargeCommand(Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED)
  }

  def timeTriggered(api: PowerChargeCommandPolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_18
        //   Commands are the selected next-state outputs
        (T) ___>: (api.decisionSnapshot.nextState == DecisionNextState.OFF &
          api.powerCommand == PowerCommand.POWER_OFF &
          api.chargeCommand == ChargeCommand.CHARGE_DISABLED |
          api.decisionSnapshot.nextState == DecisionNextState.STANDBY &
            api.powerCommand == PowerCommand.SUPPORT_POWER &
            api.chargeCommand == ChargeCommand.CHARGE_DISABLED |
          api.decisionSnapshot.nextState == DecisionNextState.CHARGING &
            api.powerCommand == PowerCommand.POWER_OFF &
            api.chargeCommand == ChargeCommand.CHARGE_ENABLED |
          api.decisionSnapshot.nextState == DecisionNextState.READY &
            api.powerCommand == PowerCommand.SUPPORT_POWER &
            api.chargeCommand == ChargeCommand.CHARGE_DISABLED |
          api.decisionSnapshot.nextState == DecisionNextState.FLYING &
            api.powerCommand == PowerCommand.FLIGHT_POWER &
            api.chargeCommand == ChargeCommand.CHARGE_DISABLED)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val next = api.get_decisionSnapshot().get.nextState
    if (next == DecisionNextState.CHARGING) {
      api.put_powerCommand(PowerCommand.POWER_OFF)
      api.put_chargeCommand(ChargeCommand.CHARGE_ENABLED)
    } else if (next == DecisionNextState.FLYING) {
      api.put_powerCommand(PowerCommand.FLIGHT_POWER)
      api.put_chargeCommand(ChargeCommand.CHARGE_DISABLED)
    } else if (next == DecisionNextState.STANDBY | next == DecisionNextState.READY) {
      api.put_powerCommand(PowerCommand.SUPPORT_POWER)
      api.put_chargeCommand(ChargeCommand.CHARGE_DISABLED)
    } else {
      api.put_powerCommand(PowerCommand.POWER_OFF)
      api.put_chargeCommand(ChargeCommand.CHARGE_DISABLED)
    }
  }

  def finalise(api: PowerChargeCommandPolicy_Operational_Api): Unit = { }
}
