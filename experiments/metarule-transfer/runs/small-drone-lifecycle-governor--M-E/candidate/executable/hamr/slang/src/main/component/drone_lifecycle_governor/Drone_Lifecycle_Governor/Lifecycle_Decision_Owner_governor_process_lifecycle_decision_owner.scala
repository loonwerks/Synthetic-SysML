// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Drone_Lifecycle_Governor.Lifecycle_Phase.Type = Drone_Lifecycle_Governor.Lifecycle_Phase.Off

  var recovery_required: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: Lifecycle_Decision_Owner_Initialization_Api): Unit = {
    Contract(Modifies(api, current_phase, recovery_required))
    current_phase = Lifecycle_Phase.Off
    recovery_required = F
    api.put_selected_phase(Lifecycle_Phase.Off)
    api.put_decision_disposition(Decision_Disposition(F, F))
    api.put_phase_report(Lifecycle_Phase.Off)
  }

  def timeTriggered(api: Lifecycle_Decision_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(api, current_phase, recovery_required),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_IMPLIES_OFF
        recovery_required ___>:
          current_phase == Lifecycle_Phase.Off &
            api.selected_phase == current_phase &
            api.phase_report == api.selected_phase,
        // case CASE_01_INVALID_INPUT
        (api.qualified_request == Qualified_Request.Invalid_Request |
          api.battery_assessment == Battery_Assessment_Value.Invalid_Battery) ___>: (current_phase == Lifecycle_Phase.Off &
          recovery_required &
          api.selected_phase == Lifecycle_Phase.Off &
          api.phase_report == Lifecycle_Phase.Off &
          api.decision_disposition.input_fault_detected &
          api.decision_disposition.recovery_pending),
        // case CASE_02_RECOVERY_BLOCKS_REPLAY
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          In(recovery_required) &
          api.qualified_request != Qualified_Request.No_Request) ___>: (current_phase == Lifecycle_Phase.Off &
          recovery_required &
          api.selected_phase == Lifecycle_Phase.Off &
          api.phase_report == Lifecycle_Phase.Off &
          !(api.decision_disposition.input_fault_detected) &
          api.decision_disposition.recovery_pending),
        // case CASE_03_NEUTRAL_CLEARS_RECOVERY
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          In(recovery_required) &
          api.qualified_request == Qualified_Request.No_Request) ___>: (current_phase == Lifecycle_Phase.Off &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Off &
          api.phase_report == Lifecycle_Phase.Off &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_04_SWITCH_OFF
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          api.qualified_request == Qualified_Request.Switch_Off) ___>: (current_phase == Lifecycle_Phase.Off &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Off &
          api.phase_report == Lifecycle_Phase.Off &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_05_SWITCH_ON
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Off &
          api.qualified_request == Qualified_Request.Switch_On) ___>: (current_phase == Lifecycle_Phase.Standby &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Standby &
          api.phase_report == Lifecycle_Phase.Standby &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_06_BEGIN_CHARGE
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment == Battery_Assessment_Value.Low_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Standby &
          api.qualified_request == Qualified_Request.Begin_Charge) ___>: (current_phase == Lifecycle_Phase.Charging &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Charging &
          api.phase_report == Lifecycle_Phase.Charging &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_07_END_CHARGE
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment == Battery_Assessment_Value.Adequate_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Charging &
          api.qualified_request == Qualified_Request.End_Charge) ___>: (current_phase == Lifecycle_Phase.Standby &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Standby &
          api.phase_report == Lifecycle_Phase.Standby &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_08_ACTIVATE
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment == Battery_Assessment_Value.Adequate_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Standby &
          api.qualified_request == Qualified_Request.Activate) ___>: (current_phase == Lifecycle_Phase.Ready &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Ready &
          api.phase_report == Lifecycle_Phase.Ready &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_09_BEGIN_FLIGHT
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment == Battery_Assessment_Value.Adequate_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Ready &
          api.qualified_request == Qualified_Request.Begin_Flight) ___>: (current_phase == Lifecycle_Phase.Flying &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Flying &
          api.phase_report == Lifecycle_Phase.Flying &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_10_END_FLIGHT
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Flying &
          api.qualified_request == Qualified_Request.End_Flight) ___>: (current_phase == Lifecycle_Phase.Ready &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Ready &
          api.phase_report == Lifecycle_Phase.Ready &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_11_DEACTIVATE
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          In(current_phase) == Lifecycle_Phase.Ready &
          api.qualified_request == Qualified_Request.Deactivate) ___>: (current_phase == Lifecycle_Phase.Standby &
          !recovery_required &
          api.selected_phase == Lifecycle_Phase.Standby &
          api.phase_report == Lifecycle_Phase.Standby &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending)),
        // case CASE_12_HOLD
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &
          !(In(recovery_required)) &
          api.qualified_request != Qualified_Request.Switch_Off &
          !(In(current_phase) == Lifecycle_Phase.Off &
            api.qualified_request == Qualified_Request.Switch_On) &
          !(In(current_phase) == Lifecycle_Phase.Standby &
            api.qualified_request == Qualified_Request.Begin_Charge &
            api.battery_assessment == Battery_Assessment_Value.Low_Battery) &
          !(In(current_phase) == Lifecycle_Phase.Charging &
            api.qualified_request == Qualified_Request.End_Charge &
            api.battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
          !(In(current_phase) == Lifecycle_Phase.Standby &
            api.qualified_request == Qualified_Request.Activate &
            api.battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
          !(In(current_phase) == Lifecycle_Phase.Ready &
            api.qualified_request == Qualified_Request.Begin_Flight &
            api.battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
          !(In(current_phase) == Lifecycle_Phase.Flying &
            api.qualified_request == Qualified_Request.End_Flight) &
          !(In(current_phase) == Lifecycle_Phase.Ready &
            api.qualified_request == Qualified_Request.Deactivate)) ___>: (!recovery_required &
          api.selected_phase == current_phase &
          api.phase_report == current_phase &
          !(api.decision_disposition.input_fault_detected) &
          !(api.decision_disposition.recovery_pending))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_qualified_request().get
    val battery = api.get_battery_assessment().get
    if (request == Qualified_Request.Invalid_Request ||
            battery == Battery_Assessment_Value.Invalid_Battery) {
          current_phase = Lifecycle_Phase.Off
          recovery_required = T
          api.put_selected_phase(Lifecycle_Phase.Off)
          api.put_phase_report(Lifecycle_Phase.Off)
          api.put_decision_disposition(Decision_Disposition(T, T))
    } else if (recovery_required) {
          current_phase = Lifecycle_Phase.Off
          if (request == Qualified_Request.No_Request) {
            recovery_required = F
            api.put_decision_disposition(Decision_Disposition(F, F))
          } else {
            recovery_required = T
            api.put_decision_disposition(Decision_Disposition(F, T))
          }
          api.put_selected_phase(Lifecycle_Phase.Off)
          api.put_phase_report(Lifecycle_Phase.Off)
    } else if (request == Qualified_Request.Switch_Off) {
          current_phase = Lifecycle_Phase.Off
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Off)
          api.put_phase_report(Lifecycle_Phase.Off)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Off &&
                   request == Qualified_Request.Switch_On) {
          current_phase = Lifecycle_Phase.Standby
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Standby)
          api.put_phase_report(Lifecycle_Phase.Standby)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Standby &&
                   request == Qualified_Request.Begin_Charge &&
                   battery == Battery_Assessment_Value.Low_Battery) {
          current_phase = Lifecycle_Phase.Charging
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Charging)
          api.put_phase_report(Lifecycle_Phase.Charging)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Charging &&
                   request == Qualified_Request.End_Charge &&
                   battery == Battery_Assessment_Value.Adequate_Battery) {
          current_phase = Lifecycle_Phase.Standby
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Standby)
          api.put_phase_report(Lifecycle_Phase.Standby)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Standby &&
                   request == Qualified_Request.Activate &&
                   battery == Battery_Assessment_Value.Adequate_Battery) {
          current_phase = Lifecycle_Phase.Ready
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Ready)
          api.put_phase_report(Lifecycle_Phase.Ready)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Ready &&
                   request == Qualified_Request.Begin_Flight &&
                   battery == Battery_Assessment_Value.Adequate_Battery) {
          current_phase = Lifecycle_Phase.Flying
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Flying)
          api.put_phase_report(Lifecycle_Phase.Flying)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Flying &&
                   request == Qualified_Request.End_Flight) {
          current_phase = Lifecycle_Phase.Ready
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Ready)
          api.put_phase_report(Lifecycle_Phase.Ready)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else if (current_phase == Lifecycle_Phase.Ready &&
                   request == Qualified_Request.Deactivate) {
          current_phase = Lifecycle_Phase.Standby
          recovery_required = F
          api.put_selected_phase(Lifecycle_Phase.Standby)
          api.put_phase_report(Lifecycle_Phase.Standby)
          api.put_decision_disposition(Decision_Disposition(F, F))
    } else {
          recovery_required = F
          api.put_selected_phase(current_phase)
          api.put_phase_report(current_phase)
          api.put_decision_disposition(Decision_Disposition(F, F))
    }
  }

  def finalise(api: Lifecycle_Decision_Owner_Operational_Api): Unit = { }
}
