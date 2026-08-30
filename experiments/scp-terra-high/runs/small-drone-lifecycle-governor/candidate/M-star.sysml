package Drone_Lifecycle_Governor {

  private import HAMR::*;

  enum def Lifecycle_Event {
    enum No_Request;
    enum Switch_On;
    enum Switch_Off;
    enum Begin_Charge;
    enum End_Charge;
    enum Activate;
    enum Deactivate;
    enum Begin_Flight;
    enum End_Flight;
  }

  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Battery_Indication {
    enum Adequate;
    enum Low;
  }

  enum def Power_Permission {
    enum Disabled;
    enum Standby_Enabled;
    enum Operational_Enabled;
  }

  enum def Lifecycle_Phase {
    enum Off;
    enum Standby;
    enum Charging;
    enum Ready;
    enum Flying;
  }

  enum def Attention_Status {
    enum None;
    enum Low_Battery;
    enum Input_Fault;
    enum Recovery_Awaiting_Neutral;
  }

  enum def Qualified_Request {
    enum Invalid_Request;
    enum No_Request;
    enum Switch_On;
    enum Switch_Off;
    enum Begin_Charge;
    enum End_Charge;
    enum Activate;
    enum Deactivate;
    enum Begin_Flight;
    enum End_Flight;
  }

  enum def Battery_Assessment_Value {
    enum Invalid_Battery;
    enum Adequate_Battery;
    enum Low_Battery;
  }

  part def Lifecycle_Request_Sample :> Data {
    attribute request_event : Lifecycle_Event;
    attribute status : Input_Status;
  }

  part def Battery_Sample :> Data {
    attribute indication : Battery_Indication;
    attribute status : Input_Status;
  }

  part def Lifecycle_Actuation :> Data {
    attribute power : Power_Permission;
    attribute charging_permitted : Base_Types::Boolean;
    attribute flight_permitted : Base_Types::Boolean;
  }

  part def Decision_Disposition :> Data {
    attribute input_fault_detected : Base_Types::Boolean;
    attribute recovery_pending : Base_Types::Boolean;
  }

  part def Request_Qualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1 [ms];
    port raw_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

    language "GUMBO" /*{
      initialize
        guarantee initial_request: qualified_request == Qualified_Request.Invalid_Request;

      compute
        compute_cases
          case invalid: assume raw_request.status == Input_Status.Invalid;
            guarantee qualified_request == Qualified_Request.Invalid_Request;
          case no_request: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.No_Request;
            guarantee qualified_request == Qualified_Request.No_Request;
          case switch_on: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.Switch_On;
            guarantee qualified_request == Qualified_Request.Switch_On;
          case switch_off: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.Switch_Off;
            guarantee qualified_request == Qualified_Request.Switch_Off;
          case begin_charge: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.Begin_Charge;
            guarantee qualified_request == Qualified_Request.Begin_Charge;
          case end_charge: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.End_Charge;
            guarantee qualified_request == Qualified_Request.End_Charge;
          case activate: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.Activate;
            guarantee qualified_request == Qualified_Request.Activate;
          case deactivate: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.Deactivate;
            guarantee qualified_request == Qualified_Request.Deactivate;
          case begin_flight: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.Begin_Flight;
            guarantee qualified_request == Qualified_Request.Begin_Flight;
          case end_flight: assume raw_request.status == Input_Status.Valid and raw_request.request_event == Lifecycle_Event.End_Flight;
            guarantee qualified_request == Qualified_Request.End_Flight;
    }*/
  }

  part def Battery_Assessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1 [ms];
    port raw_battery : DataPort { in :>> type : Battery_Sample; }
    port battery_assessment : DataPort { out :>> type : Battery_Assessment_Value; }

    language "GUMBO" /*{
      initialize
        guarantee initial_battery: battery_assessment == Battery_Assessment_Value.Invalid_Battery;

      compute
        compute_cases
          case invalid: assume raw_battery.status == Input_Status.Invalid;
            guarantee battery_assessment == Battery_Assessment_Value.Invalid_Battery;
          case adequate: assume raw_battery.status == Input_Status.Valid and raw_battery.indication == Battery_Indication.Adequate;
            guarantee battery_assessment == Battery_Assessment_Value.Adequate_Battery;
          case low: assume raw_battery.status == Input_Status.Valid and raw_battery.indication == Battery_Indication.Low;
            guarantee battery_assessment == Battery_Assessment_Value.Low_Battery;
    }*/
  }

  part def Lifecycle_Decision_Owner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1 [ms];
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    port selected_phase : DataPort { out :>> type : Lifecycle_Phase; }
    port decision_disposition : DataPort { out :>> type : Decision_Disposition; }
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    language "GUMBO" /*{
      state
        current_phase : Lifecycle_Phase;
        recovery_required : Base_Types::Boolean;

      initialize
        guarantee initial_state: current_phase == Lifecycle_Phase.Off and recovery_required == false and
          selected_phase == Lifecycle_Phase.Off and phase_report == Lifecycle_Phase.Off and
          decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;

      compute
        guarantee recovery_implies_off: recovery_required implies
          (current_phase == Lifecycle_Phase.Off and selected_phase == current_phase and phase_report == selected_phase);

        compute_cases
          case invalid_input: assume qualified_request == Qualified_Request.Invalid_Request or battery_assessment == Battery_Assessment_Value.Invalid_Battery;
            guarantee current_phase == Lifecycle_Phase.Off and recovery_required == true and
              selected_phase == Lifecycle_Phase.Off and phase_report == Lifecycle_Phase.Off and
              decision_disposition.input_fault_detected == true and decision_disposition.recovery_pending == true;
          case recovery_blocks_replay: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              In(recovery_required) and qualified_request != Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off and recovery_required == true and
              selected_phase == Lifecycle_Phase.Off and phase_report == Lifecycle_Phase.Off and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == true;
          case neutral_clears_recovery: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              In(recovery_required) and qualified_request == Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off and recovery_required == false and
              selected_phase == Lifecycle_Phase.Off and phase_report == Lifecycle_Phase.Off and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case switch_off: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              not In(recovery_required) and qualified_request == Qualified_Request.Switch_Off;
            guarantee current_phase == Lifecycle_Phase.Off and recovery_required == false and
              selected_phase == Lifecycle_Phase.Off and phase_report == Lifecycle_Phase.Off and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case switch_on: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Off and qualified_request == Qualified_Request.Switch_On;
            guarantee current_phase == Lifecycle_Phase.Standby and recovery_required == false and
              selected_phase == Lifecycle_Phase.Standby and phase_report == Lifecycle_Phase.Standby and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case begin_charge: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment == Battery_Assessment_Value.Low_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Standby and qualified_request == Qualified_Request.Begin_Charge;
            guarantee current_phase == Lifecycle_Phase.Charging and recovery_required == false and
              selected_phase == Lifecycle_Phase.Charging and phase_report == Lifecycle_Phase.Charging and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case end_charge: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment == Battery_Assessment_Value.Adequate_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Charging and qualified_request == Qualified_Request.End_Charge;
            guarantee current_phase == Lifecycle_Phase.Standby and recovery_required == false and
              selected_phase == Lifecycle_Phase.Standby and phase_report == Lifecycle_Phase.Standby and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case activate: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment == Battery_Assessment_Value.Adequate_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Standby and qualified_request == Qualified_Request.Activate;
            guarantee current_phase == Lifecycle_Phase.Ready and recovery_required == false and
              selected_phase == Lifecycle_Phase.Ready and phase_report == Lifecycle_Phase.Ready and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case begin_flight: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment == Battery_Assessment_Value.Adequate_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Ready and qualified_request == Qualified_Request.Begin_Flight;
            guarantee current_phase == Lifecycle_Phase.Flying and recovery_required == false and
              selected_phase == Lifecycle_Phase.Flying and phase_report == Lifecycle_Phase.Flying and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case end_flight: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Flying and qualified_request == Qualified_Request.End_Flight;
            guarantee current_phase == Lifecycle_Phase.Ready and recovery_required == false and
              selected_phase == Lifecycle_Phase.Ready and phase_report == Lifecycle_Phase.Ready and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case deactivate: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              not In(recovery_required) and In(current_phase) == Lifecycle_Phase.Ready and qualified_request == Qualified_Request.Deactivate;
            guarantee current_phase == Lifecycle_Phase.Standby and recovery_required == false and
              selected_phase == Lifecycle_Phase.Standby and phase_report == Lifecycle_Phase.Standby and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
          case hold: assume qualified_request != Qualified_Request.Invalid_Request and battery_assessment != Battery_Assessment_Value.Invalid_Battery and
              not In(recovery_required) and qualified_request != Qualified_Request.Switch_Off and
              not (In(current_phase) == Lifecycle_Phase.Off and qualified_request == Qualified_Request.Switch_On) and
              not (In(current_phase) == Lifecycle_Phase.Standby and qualified_request == Qualified_Request.Begin_Charge and battery_assessment == Battery_Assessment_Value.Low_Battery) and
              not (In(current_phase) == Lifecycle_Phase.Charging and qualified_request == Qualified_Request.End_Charge and battery_assessment == Battery_Assessment_Value.Adequate_Battery) and
              not (In(current_phase) == Lifecycle_Phase.Standby and qualified_request == Qualified_Request.Activate and battery_assessment == Battery_Assessment_Value.Adequate_Battery) and
              not (In(current_phase) == Lifecycle_Phase.Ready and qualified_request == Qualified_Request.Begin_Flight and battery_assessment == Battery_Assessment_Value.Adequate_Battery) and
              not (In(current_phase) == Lifecycle_Phase.Flying and qualified_request == Qualified_Request.End_Flight) and
              not (In(current_phase) == Lifecycle_Phase.Ready and qualified_request == Qualified_Request.Deactivate);
            guarantee current_phase == In(current_phase) and recovery_required == false and
              selected_phase == In(current_phase) and phase_report == In(current_phase) and
              decision_disposition.input_fault_detected == false and decision_disposition.recovery_pending == false;
    }*/
  }

  part def Controlled_Outcome_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1 [ms];
    port selected_phase : DataPort { in :>> type : Lifecycle_Phase; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }

    language "GUMBO" /*{
      initialize
        guarantee initial_actuation: lifecycle_actuation.power == Power_Permission.Disabled and
          not lifecycle_actuation.charging_permitted and not lifecycle_actuation.flight_permitted;

      compute
        compute_cases
          case off: assume selected_phase == Lifecycle_Phase.Off;
            guarantee lifecycle_actuation.power == Power_Permission.Disabled and not lifecycle_actuation.charging_permitted and not lifecycle_actuation.flight_permitted;
          case standby: assume selected_phase == Lifecycle_Phase.Standby;
            guarantee lifecycle_actuation.power == Power_Permission.Standby_Enabled and not lifecycle_actuation.charging_permitted and not lifecycle_actuation.flight_permitted;
          case charging: assume selected_phase == Lifecycle_Phase.Charging;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled and lifecycle_actuation.charging_permitted and not lifecycle_actuation.flight_permitted;
          case ready: assume selected_phase == Lifecycle_Phase.Ready;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled and not lifecycle_actuation.charging_permitted and not lifecycle_actuation.flight_permitted;
          case flying: assume selected_phase == Lifecycle_Phase.Flying;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled and not lifecycle_actuation.charging_permitted and lifecycle_actuation.flight_permitted;
    }*/
  }

  part def Attention_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1 [ms];
    port decision_disposition : DataPort { in :>> type : Decision_Disposition; }
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    port attention_status : DataPort { out :>> type : Attention_Status; }

    language "GUMBO" /*{
      initialize
        guarantee initial_attention: attention_status == Attention_Status.None;

      compute
        compute_cases
          case input_fault: assume decision_disposition.input_fault_detected;
            guarantee attention_status == Attention_Status.Input_Fault;
          case recovery: assume not decision_disposition.input_fault_detected and decision_disposition.recovery_pending;
            guarantee attention_status == Attention_Status.Recovery_Awaiting_Neutral;
          case low_battery: assume not decision_disposition.input_fault_detected and not decision_disposition.recovery_pending and
              battery_assessment == Battery_Assessment_Value.Low_Battery;
            guarantee attention_status == Attention_Status.Low_Battery;
          case none: assume not decision_disposition.input_fault_detected and not decision_disposition.recovery_pending and
              battery_assessment != Battery_Assessment_Value.Low_Battery;
            guarantee attention_status == Attention_Status.None;
    }*/
  }

  part def Governor_Process :> Process {
    part request_qualification : Request_Qualification;
    part battery_assessment : Battery_Assessment;
    part lifecycle_decision_owner : Lifecycle_Decision_Owner;
    part controlled_outcome_derivation : Controlled_Outcome_Derivation;
    part attention_derivation : Attention_Derivation;

    port lifecycle_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }
    port attention_status : DataPort { out :>> type : Attention_Status; }
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    connection support_request_to_qualifier : PortConnection
      connect lifecycle_request to request_qualification.raw_request;
    connection qualified_request_to_owner : PortConnection
      connect request_qualification.qualified_request to lifecycle_decision_owner.qualified_request;

    connection support_battery_to_assessment : PortConnection
      connect battery_sample to battery_assessment.raw_battery;
    connection assessed_battery_to_owner : PortConnection
      connect battery_assessment.battery_assessment to lifecycle_decision_owner.battery_assessment;

    connection selected_phase_to_outcome : PortConnection
      connect lifecycle_decision_owner.selected_phase to controlled_outcome_derivation.selected_phase;
    connection disposition_to_attention : PortConnection
      connect lifecycle_decision_owner.decision_disposition to attention_derivation.decision_disposition;
    connection assessed_battery_to_attention : PortConnection
      connect battery_assessment.battery_assessment to attention_derivation.battery_assessment;

    connection support_actuation_to_process_boundary : PortConnection
      connect controlled_outcome_derivation.lifecycle_actuation to lifecycle_actuation;
    connection support_attention_to_process_boundary : PortConnection
      connect attention_derivation.attention_status to attention_status;
    connection support_phase_to_process_boundary : PortConnection
      connect lifecycle_decision_owner.phase_report to phase_report;
  }

  part def Drone_Lifecycle_Governor_System :> System {
    part governor_process : Governor_Process;

    port lifecycle_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }
    port commanded_phase_report : DataPort { out :>> type : Lifecycle_Phase; }
    port attention_status : DataPort { out :>> type : Attention_Status; }

    connection support_boundary_request : PortConnection
      connect lifecycle_request to governor_process.lifecycle_request;
    connection support_boundary_battery : PortConnection
      connect battery_sample to governor_process.battery_sample;
    connection support_boundary_actuation : PortConnection
      connect governor_process.lifecycle_actuation to lifecycle_actuation;
    connection support_boundary_attention : PortConnection
      connect governor_process.attention_status to attention_status;
    connection support_boundary_phase : PortConnection
      connect governor_process.phase_report to commanded_phase_report;
  }

  part drone_lifecycle_governor : Drone_Lifecycle_Governor_System;
}
