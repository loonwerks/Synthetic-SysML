package Drone_Lifecycle_Governor {

  private import HAMR::*;

  // @trace MON-01
  enum def Lifecycle_Event {
    enum Switch_On;
    enum No_Request;
    enum Switch_Off;
    enum Begin_Charge;
    enum End_Charge;
    enum Activate;
    enum Deactivate;
    enum Begin_Flight;
    enum End_Flight;
  }

  // @trace MON-01
  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-02
  enum def Battery_Indication {
    enum Adequate;
    enum Low;
  }

  // @trace CTRL-01
  enum def Power_Permission {
    enum Disabled;
    enum Standby_Enabled;
    enum Operational_Enabled;
  }

  // @trace CTRL-02
  enum def Lifecycle_Phase {
    enum Off;
    enum Standby;
    enum Charging;
    enum Ready;
    enum Flying;
  }

  // @trace CTRL-03
  enum def Attention_Status {
    enum None;
    enum Low_Battery;
    enum Input_Fault;
    enum Recovery_Awaiting_Neutral;
  }

  // @trace PART-01
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

  // @trace PART-02
  enum def Battery_Assessment_Value {
    enum Invalid_Battery;
    enum Adequate_Battery;
    enum Low_Battery;
  }

  // @trace MON-01
  part def Lifecycle_Request_Sample :> Data {
    // @trace MON-01
    attribute 'event' : Lifecycle_Event;
    // @trace MON-01
    attribute status : Input_Status;
  }

  // @trace MON-02
  part def Battery_Sample :> Data {
    // @trace MON-02
    attribute indication : Battery_Indication;
    // @trace MON-02
    attribute status : Input_Status;
  }

  // @trace CTRL-01
  part def Lifecycle_Actuation :> Data {
    // @trace CTRL-01
    attribute power : Power_Permission;
    // @trace CTRL-01
    attribute charging_permitted : Base_Types::Boolean;
    // @trace CTRL-01
    attribute flight_permitted : Base_Types::Boolean;
  }

  // @trace INT-06
  part def Decision_Disposition :> Data {
    // @trace INT-06
    attribute input_fault_detected : Base_Types::Boolean;
    // @trace INT-06
    attribute recovery_pending : Base_Types::Boolean;
  }

  // @trace PART-01
  part def Request_Qualification :> Thread {
    // @trace INT-01
    port raw_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    // @trace INT-02
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee SAFE_INITIAL_REQUEST_FACT "The request fact starts untrusted before a sample is qualified":
          qualified_request == Qualified_Request.Invalid_Request;

      compute
        compute_cases
          // @trace QUAL-REQ-01
          case REQUEST_INVALID "Any invalid status collapses all event values to Invalid_Request":
            assume raw_request.status == Input_Status.Invalid;
            guarantee qualified_request == Qualified_Request.Invalid_Request;
          // @trace QUAL-REQ-01
          case REQUEST_NO_REQUEST "A valid No_Request retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.No_Request;
            guarantee qualified_request == Qualified_Request.No_Request;
          // @trace QUAL-REQ-01
          case REQUEST_SWITCH_ON "A valid Switch_On retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.Switch_On;
            guarantee qualified_request == Qualified_Request.Switch_On;
          // @trace QUAL-REQ-01
          case REQUEST_SWITCH_OFF "A valid Switch_Off retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.Switch_Off;
            guarantee qualified_request == Qualified_Request.Switch_Off;
          // @trace QUAL-REQ-01
          case REQUEST_BEGIN_CHARGE "A valid Begin_Charge retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.Begin_Charge;
            guarantee qualified_request == Qualified_Request.Begin_Charge;
          // @trace QUAL-REQ-01
          case REQUEST_END_CHARGE "A valid End_Charge retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.End_Charge;
            guarantee qualified_request == Qualified_Request.End_Charge;
          // @trace QUAL-REQ-01
          case REQUEST_ACTIVATE "A valid Activate retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.Activate;
            guarantee qualified_request == Qualified_Request.Activate;
          // @trace QUAL-REQ-01
          case REQUEST_DEACTIVATE "A valid Deactivate retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.Deactivate;
            guarantee qualified_request == Qualified_Request.Deactivate;
          // @trace QUAL-REQ-01
          case REQUEST_BEGIN_FLIGHT "A valid Begin_Flight retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.Begin_Flight;
            guarantee qualified_request == Qualified_Request.Begin_Flight;
          // @trace QUAL-REQ-01
          case REQUEST_END_FLIGHT "A valid End_Flight retains its domain meaning":
            assume raw_request.status == Input_Status.Valid & raw_request.'event' == Lifecycle_Event.End_Flight;
            guarantee qualified_request == Qualified_Request.End_Flight;
    }*/
  }

  // @trace PART-02
  part def Battery_Assessment :> Thread {
    // @trace INT-03
    port raw_battery : DataPort { in :>> type : Battery_Sample; }
    // @trace INT-04
    port battery_assessment : DataPort { out :>> type : Battery_Assessment_Value; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee SAFE_INITIAL_BATTERY_FACT "The battery fact starts untrusted before a sample is assessed":
          battery_assessment == Battery_Assessment_Value.Invalid_Battery;

      compute
        compute_cases
          // @trace QUAL-BATT-01
          case BATTERY_INVALID "Any invalid status collapses both indications to Invalid_Battery":
            assume raw_battery.status == Input_Status.Invalid;
            guarantee battery_assessment == Battery_Assessment_Value.Invalid_Battery;
          // @trace QUAL-BATT-01
          case BATTERY_ADEQUATE "A valid Adequate indication derives Adequate_Battery":
            assume raw_battery.status == Input_Status.Valid & raw_battery.indication == Battery_Indication.Adequate;
            guarantee battery_assessment == Battery_Assessment_Value.Adequate_Battery;
          // @trace QUAL-BATT-01
          case BATTERY_LOW "A valid Low indication derives Low_Battery":
            assume raw_battery.status == Input_Status.Valid & raw_battery.indication == Battery_Indication.Low;
            guarantee battery_assessment == Battery_Assessment_Value.Low_Battery;
    }*/
  }

  // @trace PART-03
  part def Lifecycle_Decision_Owner :> Thread {
    // @trace INT-02
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    // @trace INT-04
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    // @trace INT-05
    port selected_phase : DataPort { out :>> type : Lifecycle_Phase; }
    // @trace INT-06
    port decision_disposition : DataPort { out :>> type : Decision_Disposition; }
    // @trace INT-10
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    language "GUMBO" /*{
      // @trace STATE-01
      state
        current_phase: Lifecycle_Phase;
        recovery_required: Base_Types::Boolean;

      initialize
        // @trace INIT-01
        guarantee INITIAL_OWNER_STATE_AND_OUTPUTS "The owner initializes Off, clears recovery, and publishes its safe phase and disposition":
          current_phase == Lifecycle_Phase.Off &
          recovery_required == F &
          selected_phase == Lifecycle_Phase.Off &
          phase_report == Lifecycle_Phase.Off &
          decision_disposition.input_fault_detected == F &
          decision_disposition.recovery_pending == F;

      compute
        // @trace INVAR-01
        guarantee RECOVERY_IMPLIES_OFF "Every post-state requiring recovery is commanded Off":
          '->:'(recovery_required, current_phase == Lifecycle_Phase.Off) &
          selected_phase == current_phase &
          phase_report == selected_phase;

        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_INPUT "Either invalid qualified input has top priority and enters recovery in Off":
            assume qualified_request == Qualified_Request.Invalid_Request |
                   battery_assessment == Battery_Assessment_Value.Invalid_Battery;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == T &
                      selected_phase == Lifecycle_Phase.Off &
                      phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == T &
                      decision_disposition.recovery_pending == T;

          // @trace CASE-02
          case CASE_02_RECOVERY_BLOCKS_REPLAY "A valid nonneutral request remains blocked while recovery is required":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == T &
                   qualified_request != Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == T &
                      selected_phase == Lifecycle_Phase.Off &
                      phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == T;

          // @trace CASE-03
          case CASE_03_NEUTRAL_CLEARS_RECOVERY "A valid neutral observation clears recovery without leaving Off":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == T &
                   qualified_request == Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Off &
                      phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-04
          case CASE_04_SWITCH_OFF "A valid Switch_Off overrides every normal phase transition":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   qualified_request == Qualified_Request.Switch_Off;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Off &
                      phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-05
          case CASE_05_SWITCH_ON "Switch_On moves Off to Standby":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Off &
                   qualified_request == Qualified_Request.Switch_On;
            guarantee current_phase == Lifecycle_Phase.Standby &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Standby &
                      phase_report == Lifecycle_Phase.Standby &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-06
          case CASE_06_BEGIN_CHARGE "Low battery and Begin_Charge move Standby to Charging":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Standby &
                   qualified_request == Qualified_Request.Begin_Charge &
                   battery_assessment == Battery_Assessment_Value.Low_Battery;
            guarantee current_phase == Lifecycle_Phase.Charging &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Charging &
                      phase_report == Lifecycle_Phase.Charging &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-07
          case CASE_07_END_CHARGE "Adequate battery and End_Charge move Charging to Standby":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Charging &
                   qualified_request == Qualified_Request.End_Charge &
                   battery_assessment == Battery_Assessment_Value.Adequate_Battery;
            guarantee current_phase == Lifecycle_Phase.Standby &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Standby &
                      phase_report == Lifecycle_Phase.Standby &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-08
          case CASE_08_ACTIVATE "Adequate battery and Activate move Standby to Ready":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Standby &
                   qualified_request == Qualified_Request.Activate &
                   battery_assessment == Battery_Assessment_Value.Adequate_Battery;
            guarantee current_phase == Lifecycle_Phase.Ready &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Ready &
                      phase_report == Lifecycle_Phase.Ready &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-09
          case CASE_09_BEGIN_FLIGHT "Adequate battery and Begin_Flight move Ready to Flying":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Ready &
                   qualified_request == Qualified_Request.Begin_Flight &
                   battery_assessment == Battery_Assessment_Value.Adequate_Battery;
            guarantee current_phase == Lifecycle_Phase.Flying &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Flying &
                      phase_report == Lifecycle_Phase.Flying &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-10
          case CASE_10_END_FLIGHT "End_Flight moves Flying to Ready without asserting landing":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Flying &
                   qualified_request == Qualified_Request.End_Flight;
            guarantee current_phase == Lifecycle_Phase.Ready &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Ready &
                      phase_report == Lifecycle_Phase.Ready &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-11
          case CASE_11_DEACTIVATE "Deactivate moves Ready to Standby":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   In(current_phase) == Lifecycle_Phase.Ready &
                   qualified_request == Qualified_Request.Deactivate;
            guarantee current_phase == Lifecycle_Phase.Standby &
                      recovery_required == F &
                      selected_phase == Lifecycle_Phase.Standby &
                      phase_report == Lifecycle_Phase.Standby &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;

          // @trace CASE-12
          case CASE_12_HOLD "Every remaining valid nonrecovery snapshot holds the prior phase":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   battery_assessment != Battery_Assessment_Value.Invalid_Battery &
                   In(recovery_required) == F &
                   qualified_request != Qualified_Request.Switch_Off &
                   not (In(current_phase) == Lifecycle_Phase.Off & qualified_request == Qualified_Request.Switch_On) &
                   not (In(current_phase) == Lifecycle_Phase.Standby & qualified_request == Qualified_Request.Begin_Charge & battery_assessment == Battery_Assessment_Value.Low_Battery) &
                   not (In(current_phase) == Lifecycle_Phase.Charging & qualified_request == Qualified_Request.End_Charge & battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
                   not (In(current_phase) == Lifecycle_Phase.Standby & qualified_request == Qualified_Request.Activate & battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
                   not (In(current_phase) == Lifecycle_Phase.Ready & qualified_request == Qualified_Request.Begin_Flight & battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
                   not (In(current_phase) == Lifecycle_Phase.Flying & qualified_request == Qualified_Request.End_Flight) &
                   not (In(current_phase) == Lifecycle_Phase.Ready & qualified_request == Qualified_Request.Deactivate);
            guarantee current_phase == In(current_phase) &
                      recovery_required == F &
                      selected_phase == In(current_phase) &
                      phase_report == In(current_phase) &
                      decision_disposition.input_fault_detected == F &
                      decision_disposition.recovery_pending == F;
    }*/
  }

  // @trace PART-04
  part def Controlled_Outcome_Derivation :> Thread {
    // @trace INT-05
    port selected_phase : DataPort { in :>> type : Lifecycle_Phase; }
    // @trace INT-08
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_ACTUATION_DISABLED "Actuation initializes to the complete Off mapping":
          lifecycle_actuation.power == Power_Permission.Disabled &
          lifecycle_actuation.charging_permitted == F &
          lifecycle_actuation.flight_permitted == F;

      compute
        compute_cases
          // @trace PART-04
          case ACTUATION_OFF "Off disables every logical permission":
            assume selected_phase == Lifecycle_Phase.Off;
            guarantee lifecycle_actuation.power == Power_Permission.Disabled & lifecycle_actuation.charging_permitted == F & lifecycle_actuation.flight_permitted == F;
          // @trace PART-04
          case ACTUATION_STANDBY "Standby enables standby power only":
            assume selected_phase == Lifecycle_Phase.Standby;
            guarantee lifecycle_actuation.power == Power_Permission.Standby_Enabled & lifecycle_actuation.charging_permitted == F & lifecycle_actuation.flight_permitted == F;
          // @trace PART-04
          case ACTUATION_CHARGING "Charging enables operational power and charging only":
            assume selected_phase == Lifecycle_Phase.Charging;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled & lifecycle_actuation.charging_permitted == T & lifecycle_actuation.flight_permitted == F;
          // @trace PART-04
          case ACTUATION_READY "Ready enables operational power without charging or flight":
            assume selected_phase == Lifecycle_Phase.Ready;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled & lifecycle_actuation.charging_permitted == F & lifecycle_actuation.flight_permitted == F;
          // @trace PART-04
          case ACTUATION_FLYING "Flying enables operational power and flight only":
            assume selected_phase == Lifecycle_Phase.Flying;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled & lifecycle_actuation.charging_permitted == F & lifecycle_actuation.flight_permitted == T;
    }*/
  }

  // @trace PART-05
  part def Attention_Derivation :> Thread {
    // @trace INT-06
    port decision_disposition : DataPort { in :>> type : Decision_Disposition; }
    // @trace INT-07
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    // @trace INT-09
    port attention_status : DataPort { out :>> type : Attention_Status; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_ATTENTION_NONE "Pilot attention initializes to None":
          attention_status == Attention_Status.None;

      compute
        compute_cases
          // @trace ADVISORY-01
          case ATTENTION_INPUT_FAULT "Input fault has highest advisory priority":
            assume decision_disposition.input_fault_detected == T;
            guarantee attention_status == Attention_Status.Input_Fault;
          // @trace ADVISORY-01
          case ATTENTION_RECOVERY "Recovery pending has priority after input fault":
            assume decision_disposition.input_fault_detected == F & decision_disposition.recovery_pending == T;
            guarantee attention_status == Attention_Status.Recovery_Awaiting_Neutral;
          // @trace ADVISORY-01
          case ATTENTION_LOW_BATTERY "Valid low battery is advisory when no fault or recovery is active":
            assume decision_disposition.input_fault_detected == F & decision_disposition.recovery_pending == F & battery_assessment == Battery_Assessment_Value.Low_Battery;
            guarantee attention_status == Attention_Status.Low_Battery;
          // @trace ADVISORY-01
          case ATTENTION_NONE "All remaining nonfault and nonrecovery inputs need no attention":
            assume decision_disposition.input_fault_detected == F & decision_disposition.recovery_pending == F & battery_assessment != Battery_Assessment_Value.Low_Battery;
            guarantee attention_status == Attention_Status.None;
    }*/
  }

  // @generated-support behavior-free HAMR Process containment required by RESOLVE-02
  part def Governor_Process :> Process {
    // @trace PART-01
    part request_qualification : Request_Qualification;
    // @trace PART-02
    part battery_assessment : Battery_Assessment;
    // @trace PART-03
    part lifecycle_decision_owner : Lifecycle_Decision_Owner;
    // @trace PART-04
    part controlled_outcome_derivation : Controlled_Outcome_Derivation;
    // @trace PART-05
    part attention_derivation : Attention_Derivation;

    // @generated-support routing-only Process boundary port for INT-01
    port lifecycle_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    // @generated-support routing-only Process boundary port for INT-03
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    // @generated-support routing-only Process boundary port for INT-08
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }
    // @generated-support routing-only Process boundary port for INT-09
    port attention_status : DataPort { out :>> type : Attention_Status; }
    // @generated-support routing-only Process boundary port for INT-10
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    // @generated-support inbound refinement hop for INT-01
    connection support_request_to_qualifier : PortConnection
      connect lifecycle_request to request_qualification.raw_request;
    // @trace INT-02
    connection qualified_request_to_owner : PortConnection
      connect request_qualification.qualified_request to lifecycle_decision_owner.qualified_request;

    // @generated-support inbound refinement hop for INT-03
    connection support_battery_to_assessment : PortConnection
      connect battery_sample to battery_assessment.raw_battery;
    // @trace INT-04
    connection assessed_battery_to_owner : PortConnection
      connect battery_assessment.battery_assessment to lifecycle_decision_owner.battery_assessment;

    // @trace INT-05
    connection selected_phase_to_outcome : PortConnection
      connect lifecycle_decision_owner.selected_phase to controlled_outcome_derivation.selected_phase;
    // @trace INT-06
    connection disposition_to_attention : PortConnection
      connect lifecycle_decision_owner.decision_disposition to attention_derivation.decision_disposition;
    // @trace INT-07
    connection assessed_battery_to_attention : PortConnection
      connect battery_assessment.battery_assessment to attention_derivation.battery_assessment;

    // @generated-support outbound refinement hop for INT-08
    connection support_actuation_to_process_boundary : PortConnection
      connect controlled_outcome_derivation.lifecycle_actuation to lifecycle_actuation;
    // @generated-support outbound refinement hop for INT-09
    connection support_attention_to_process_boundary : PortConnection
      connect attention_derivation.attention_status to attention_status;
    // @generated-support outbound refinement hop for INT-10
    connection support_phase_to_process_boundary : PortConnection
      connect lifecycle_decision_owner.phase_report to phase_report;
  }

  // @trace BOUND-01
  part def Drone_Lifecycle_Governor_System :> System {
    // @generated-support sole behavior-free containment usage required by RESOLVE-02
    part governor_process : Governor_Process;

    // @trace MON-01
    port lifecycle_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    // @trace MON-02
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    // @trace CTRL-01
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }
    // @trace CTRL-02
    port commanded_phase_report : DataPort { out :>> type : Lifecycle_Phase; }
    // @trace CTRL-03
    port attention_status : DataPort { out :>> type : Attention_Status; }

    // @generated-support root-to-Process route for INT-01
    connection support_boundary_request : PortConnection
      connect lifecycle_request to governor_process.lifecycle_request;
    // @generated-support root-to-Process route for INT-03
    connection support_boundary_battery : PortConnection
      connect battery_sample to governor_process.battery_sample;
    // @generated-support Process-to-root route for INT-08
    connection support_boundary_actuation : PortConnection
      connect governor_process.lifecycle_actuation to lifecycle_actuation;
    // @generated-support Process-to-root route for INT-09
    connection support_boundary_attention : PortConnection
      connect governor_process.attention_status to attention_status;
    // @generated-support Process-to-root route for INT-10
    connection support_boundary_phase : PortConnection
      connect governor_process.phase_report to commanded_phase_report;
  }

  // @trace STRUCT-01
  part drone_lifecycle_governor : Drone_Lifecycle_Governor_System;
}
