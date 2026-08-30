// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Drone_Lifecycle_Governor.Lifecycle_Phase.Type = Drone_Lifecycle_Governor.Lifecycle_Phase.Off

  var recovery_required: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: Lifecycle_Decision_Owner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, current_phase, recovery_required),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_state
        current_phase == Lifecycle_Phase.Off &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Off &&
          api.phase_report == Lifecycle_Phase.Off &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F
        // END INITIALIZES ENSURES
      )
    )
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
        // guarantee recovery_implies_off
        recovery_required ___>:
          current_phase == Lifecycle_Phase.Off &&
            api.selected_phase == current_phase &&
            api.phase_report == api.selected_phase,
        // case invalid_input
        (api.qualified_request == Qualified_Request.Invalid_Request ||
          api.battery_assessment == Battery_Assessment_Value.Invalid_Battery) ___>: (current_phase == Lifecycle_Phase.Off &&
          recovery_required == T &&
          api.selected_phase == Lifecycle_Phase.Off &&
          api.phase_report == Lifecycle_Phase.Off &&
          api.decision_disposition.input_fault_detected == T &&
          api.decision_disposition.recovery_pending == T),
        // case recovery_blocks_replay
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          In(recovery_required) &&
          api.qualified_request != Qualified_Request.No_Request) ___>: (current_phase == Lifecycle_Phase.Off &&
          recovery_required == T &&
          api.selected_phase == Lifecycle_Phase.Off &&
          api.phase_report == Lifecycle_Phase.Off &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == T),
        // case neutral_clears_recovery
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          In(recovery_required) &&
          api.qualified_request == Qualified_Request.No_Request) ___>: (current_phase == Lifecycle_Phase.Off &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Off &&
          api.phase_report == Lifecycle_Phase.Off &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case switch_off
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          !(In(recovery_required)) &&
          api.qualified_request == Qualified_Request.Switch_Off) ___>: (current_phase == Lifecycle_Phase.Off &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Off &&
          api.phase_report == Lifecycle_Phase.Off &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case switch_on
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Off &&
          api.qualified_request == Qualified_Request.Switch_On) ___>: (current_phase == Lifecycle_Phase.Standby &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Standby &&
          api.phase_report == Lifecycle_Phase.Standby &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case begin_charge
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment == Battery_Assessment_Value.Low_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Standby &&
          api.qualified_request == Qualified_Request.Begin_Charge) ___>: (current_phase == Lifecycle_Phase.Charging &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Charging &&
          api.phase_report == Lifecycle_Phase.Charging &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case end_charge
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment == Battery_Assessment_Value.Adequate_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Charging &&
          api.qualified_request == Qualified_Request.End_Charge) ___>: (current_phase == Lifecycle_Phase.Standby &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Standby &&
          api.phase_report == Lifecycle_Phase.Standby &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case activate
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment == Battery_Assessment_Value.Adequate_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Standby &&
          api.qualified_request == Qualified_Request.Activate) ___>: (current_phase == Lifecycle_Phase.Ready &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Ready &&
          api.phase_report == Lifecycle_Phase.Ready &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case begin_flight
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment == Battery_Assessment_Value.Adequate_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Ready &&
          api.qualified_request == Qualified_Request.Begin_Flight) ___>: (current_phase == Lifecycle_Phase.Flying &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Flying &&
          api.phase_report == Lifecycle_Phase.Flying &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case end_flight
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Flying &&
          api.qualified_request == Qualified_Request.End_Flight) ___>: (current_phase == Lifecycle_Phase.Ready &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Ready &&
          api.phase_report == Lifecycle_Phase.Ready &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case deactivate
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          !(In(recovery_required)) &&
          In(current_phase) == Lifecycle_Phase.Ready &&
          api.qualified_request == Qualified_Request.Deactivate) ___>: (current_phase == Lifecycle_Phase.Standby &&
          recovery_required == F &&
          api.selected_phase == Lifecycle_Phase.Standby &&
          api.phase_report == Lifecycle_Phase.Standby &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F),
        // case hold
        (api.qualified_request != Qualified_Request.Invalid_Request &&
          api.battery_assessment != Battery_Assessment_Value.Invalid_Battery &&
          !(In(recovery_required)) &&
          api.qualified_request != Qualified_Request.Switch_Off &&
          !(In(current_phase) == Lifecycle_Phase.Off &&
            api.qualified_request == Qualified_Request.Switch_On) &&
          !(In(current_phase) == Lifecycle_Phase.Standby &&
            api.qualified_request == Qualified_Request.Begin_Charge &&
            api.battery_assessment == Battery_Assessment_Value.Low_Battery) &&
          !(In(current_phase) == Lifecycle_Phase.Charging &&
            api.qualified_request == Qualified_Request.End_Charge &&
            api.battery_assessment == Battery_Assessment_Value.Adequate_Battery) &&
          !(In(current_phase) == Lifecycle_Phase.Standby &&
            api.qualified_request == Qualified_Request.Activate &&
            api.battery_assessment == Battery_Assessment_Value.Adequate_Battery) &&
          !(In(current_phase) == Lifecycle_Phase.Ready &&
            api.qualified_request == Qualified_Request.Begin_Flight &&
            api.battery_assessment == Battery_Assessment_Value.Adequate_Battery) &&
          !(In(current_phase) == Lifecycle_Phase.Flying &&
            api.qualified_request == Qualified_Request.End_Flight) &&
          !(In(current_phase) == Lifecycle_Phase.Ready &&
            api.qualified_request == Qualified_Request.Deactivate)) ___>: (current_phase == In(current_phase) &&
          recovery_required == F &&
          api.selected_phase == In(current_phase) &&
          api.phase_report == In(current_phase) &&
          api.decision_disposition.input_fault_detected == F &&
          api.decision_disposition.recovery_pending == F)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request: Drone_Lifecycle_Governor.Qualified_Request.Type = api.get_qualified_request().get
    val battery: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = api.get_battery_assessment().get

    var next_phase: Drone_Lifecycle_Governor.Lifecycle_Phase.Type = current_phase
    var next_recovery_required: B = F
    var input_fault_detected: B = F
    var recovery_pending: B = F

    if (request == Qualified_Request.Invalid_Request ||
        battery == Battery_Assessment_Value.Invalid_Battery) {
      next_phase = Lifecycle_Phase.Off
      next_recovery_required = T
      input_fault_detected = T
      recovery_pending = T
    } else if (recovery_required) {
      next_phase = Lifecycle_Phase.Off
      if (request == Qualified_Request.No_Request) {
        next_recovery_required = F
      } else {
        next_recovery_required = T
        recovery_pending = T
      }
    } else if (request == Qualified_Request.Switch_Off) {
      next_phase = Lifecycle_Phase.Off
    } else if (current_phase == Lifecycle_Phase.Off &&
        request == Qualified_Request.Switch_On) {
      next_phase = Lifecycle_Phase.Standby
    } else if (current_phase == Lifecycle_Phase.Standby &&
        request == Qualified_Request.Begin_Charge &&
        battery == Battery_Assessment_Value.Low_Battery) {
      next_phase = Lifecycle_Phase.Charging
    } else if (current_phase == Lifecycle_Phase.Charging &&
        request == Qualified_Request.End_Charge &&
        battery == Battery_Assessment_Value.Adequate_Battery) {
      next_phase = Lifecycle_Phase.Standby
    } else if (current_phase == Lifecycle_Phase.Standby &&
        request == Qualified_Request.Activate &&
        battery == Battery_Assessment_Value.Adequate_Battery) {
      next_phase = Lifecycle_Phase.Ready
    } else if (current_phase == Lifecycle_Phase.Ready &&
        request == Qualified_Request.Begin_Flight &&
        battery == Battery_Assessment_Value.Adequate_Battery) {
      next_phase = Lifecycle_Phase.Flying
    } else if (current_phase == Lifecycle_Phase.Flying &&
        request == Qualified_Request.End_Flight) {
      next_phase = Lifecycle_Phase.Ready
    } else if (current_phase == Lifecycle_Phase.Ready &&
        request == Qualified_Request.Deactivate) {
      next_phase = Lifecycle_Phase.Standby
    }

    current_phase = next_phase
    recovery_required = next_recovery_required
    api.put_selected_phase(next_phase)
    api.put_decision_disposition(Decision_Disposition(input_fault_detected, recovery_pending))
    api.put_phase_report(next_phase)
  }

  def finalise(api: Lifecycle_Decision_Owner_Operational_Api): Unit = { }
}
