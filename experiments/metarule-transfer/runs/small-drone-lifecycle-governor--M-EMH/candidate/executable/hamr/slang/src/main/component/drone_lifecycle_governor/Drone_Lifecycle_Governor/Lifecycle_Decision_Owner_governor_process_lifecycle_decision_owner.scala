// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Drone_Lifecycle_Governor.Lifecycle_Phase.Type = Drone_Lifecycle_Governor.Lifecycle_Phase.Off

  var recovery_required: Base_Types.Boolean = F
  // END STATE VARS

  def initialise(api: Lifecycle_Decision_Owner_Initialization_Api): Unit = {
    Contract(Modifies(api, current_phase, recovery_required))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    current_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Off
    api.put_selected_phase(Drone_Lifecycle_Governor.Lifecycle_Phase.Off)
    recovery_required = F
    api.put_decision_disposition(Drone_Lifecycle_Governor.Decision_Disposition(F, F))
    api.put_phase_report(Drone_Lifecycle_Governor.Lifecycle_Phase.Off)
  }

  def timeTriggered(api: Lifecycle_Decision_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(api, current_phase, recovery_required),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_IMPLIES_OFF
        //   N.md#RECOVERY_IMPLIES_OFF
        recovery_required ___>:
          current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
            api.selected_phase == current_phase &
            api.phase_report == api.selected_phase,
        // case CASE_01_INVALID_INPUT
        //   N.md#CASE_01_INVALID_INPUT
        (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request |
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          api.decision_disposition.input_fault_detected &
          api.decision_disposition.recovery_pending),
        // case CASE_02_RECOVERY_BLOCKS_REPLAY
        //   N.md#CASE_02_RECOVERY_BLOCKS_REPLAY
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          In(recovery_required) &
          api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.No_Request) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          !(api.decision_disposition.input_fault_detected) &
          api.decision_disposition.recovery_pending),
        // case CASE_03_NEUTRAL_CLEARS_RECOVERY
        //   N.md#CASE_03_NEUTRAL_CLEARS_RECOVERY
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          In(recovery_required) &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.No_Request) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_04_SWITCH_OFF
        //   N.md#CASE_04_SWITCH_OFF
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Switch_Off) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_05_SWITCH_ON
        //   N.md#CASE_05_SWITCH_ON
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Switch_On) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_06_BEGIN_CHARGE
        //   N.md#CASE_06_BEGIN_CHARGE
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_07_END_CHARGE
        //   N.md#CASE_07_END_CHARGE
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.End_Charge) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_08_ACTIVATE
        //   N.md#CASE_08_ACTIVATE
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Activate) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_09_BEGIN_FLIGHT
        //   N.md#CASE_09_BEGIN_FLIGHT
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_10_END_FLIGHT
        //   N.md#CASE_10_END_FLIGHT
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.End_Flight) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_11_DEACTIVATE
        //   N.md#CASE_11_DEACTIVATE
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
          api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Deactivate) ___>: (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          !recovery_required &
          api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          api.phase_report == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_12_HOLD
        //   N.md#CASE_12_HOLD
        (api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          api.qualified_request != Drone_Lifecycle_Governor.Qualified_Request.Switch_Off &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Switch_On) &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge &
            api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery) &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.End_Charge &
            api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery) &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Activate &
            api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery) &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight &
            api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery) &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.End_Flight) &
          !(In(current_phase) == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &
            api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Deactivate)) ___>: (!recovery_required &
          api.selected_phase == current_phase &
          api.phase_report == current_phase &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_qualified_request().get
    val battery = api.get_battery_assessment().get
    var next_phase = current_phase
    var next_recovery = F
    var input_fault = F
    var recovery_pending = F

        if (request == Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request ||
            battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Off
          next_recovery = T
          input_fault = T
          recovery_pending = T
        } else if (recovery_required) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Off
          if (request == Drone_Lifecycle_Governor.Qualified_Request.No_Request) {
            next_recovery = F
          } else {
            next_recovery = T
            recovery_pending = T
          }
        } else if (request == Drone_Lifecycle_Governor.Qualified_Request.Switch_Off) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Off
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.Switch_On) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Standby
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge &&
                   battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Charging
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.End_Charge &&
                   battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Standby
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.Activate &&
                   battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Ready
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight &&
                   battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Flying
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.End_Flight) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Ready
        } else if (current_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready &&
                   request == Drone_Lifecycle_Governor.Qualified_Request.Deactivate) {
          next_phase = Drone_Lifecycle_Governor.Lifecycle_Phase.Standby
        }

        current_phase = next_phase
        recovery_required = next_recovery
        api.put_selected_phase(next_phase)
        api.put_phase_report(next_phase)
    api.put_decision_disposition(Drone_Lifecycle_Governor.Decision_Disposition(input_fault, recovery_pending))
  }

  def finalise(api: Lifecycle_Decision_Owner_Operational_Api): Unit = { }
}
