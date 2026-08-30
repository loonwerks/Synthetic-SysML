package Drone_Lifecycle_Governor {

  private import HAMR::*;

  // @trace MON-01
  enum def Lifecycle_Request {
    enum No_Request;
    enum Switch_On;
    enum Switch_Off;
    enum Begin_Charge;
    enum End_Charge;
    enum Activate;
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

  // @trace MON-03
  enum def Charge_Connection {
    enum Connected;
    enum Disconnected;
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
  enum def Pilot_Notice {
    enum None;
    enum Low_Battery;
    enum Charger_Unavailable;
    enum Request_Rejected;
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
    enum Begin_Flight;
    enum End_Flight;
  }

  // @trace PART-02
  enum def Battery_Evidence {
    enum Invalid_Battery;
    enum Adequate_Battery;
    enum Low_Battery;
  }

  // @trace QUAL-CHARGE-01
  enum def Charge_Context {
    enum Invalid_Charge_Context;
    enum Charge_Available;
    enum Charge_Unavailable;
  }

  // @trace INT-08
  enum def Rejection_Reason {
    enum No_Rejection;
    enum Inapplicable;
    enum Battery_Insufficient;
    enum Charger_Unavailable;
  }

  // All fields inspected by GUMBO are attributes, never nested parts.
  // @trace MON-01
  part def Lifecycle_Request_Sample :> Data {
    // @trace MON-01
    attribute request : Lifecycle_Request;
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

  // @trace MON-03
  part def Charge_Connection_Sample :> Data {
    // @trace MON-03
    attribute connection_state : Charge_Connection;
    // @trace MON-03
    attribute status : Input_Status;
  }

  // @trace CTRL-01
  part def Lifecycle_Enablement :> Data {
    // @trace CTRL-01
    attribute power : Power_Permission;
    // @trace CTRL-01
    attribute charging_permitted : Base_Types::Boolean;
    // @trace CTRL-01
    attribute flight_permitted : Base_Types::Boolean;
  }

  // @trace INT-08
  part def Decision_Disposition :> Data {
    // @trace INT-08
    attribute input_fault_detected : Base_Types::Boolean;
    // @trace INT-08
    attribute recovery_pending : Base_Types::Boolean;
    // @trace INT-08
    attribute rejection_reason : Rejection_Reason;
  }

  // @trace PART-01
  part def Request_Qualification :> Periodic_Rust_Thread {
    // @trace INT-01
    port request_sample : DataPort { in :>> type : Lifecycle_Request_Sample; }
    // @trace INT-02
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-REQ-01
        def qualify_request(value: Lifecycle_Request_Sample): Qualified_Request :=
          if (value.status == Input_Status.Invalid)? Qualified_Request.Invalid_Request
          else if (value.request == Lifecycle_Request.No_Request)? Qualified_Request.No_Request
          else if (value.request == Lifecycle_Request.Switch_On)? Qualified_Request.Switch_On
          else if (value.request == Lifecycle_Request.Switch_Off)? Qualified_Request.Switch_Off
          else if (value.request == Lifecycle_Request.Begin_Charge)? Qualified_Request.Begin_Charge
          else if (value.request == Lifecycle_Request.End_Charge)? Qualified_Request.End_Charge
          else if (value.request == Lifecycle_Request.Activate)? Qualified_Request.Activate
          else if (value.request == Lifecycle_Request.Begin_Flight)? Qualified_Request.Begin_Flight
          else Qualified_Request.End_Flight;

      initialize
        // @trace INIT-01
        guarantee INITIAL_REQUEST_INVALID "Request qualification starts in an explicitly untrusted state":
          qualified_request == Qualified_Request.Invalid_Request;

      compute
        // @trace QUAL-REQ-01
        guarantee REQUEST_QUALIFICATION_TOTAL "Both request fields determine the validity-aware qualified request":
          qualified_request == qualify_request(request_sample);
    }*/
  }

  // @trace PART-02
  part def Battery_Evidence_Assessment :> Periodic_Rust_Thread {
    // @trace INT-03
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    // @trace INT-04
    port battery_evidence_for_governor : DataPort { out :>> type : Battery_Evidence; }
    // @trace INT-05
    port battery_evidence_for_notice : DataPort { out :>> type : Battery_Evidence; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-BATT-01
        def assess_battery(value: Battery_Sample): Battery_Evidence :=
          if (value.status == Input_Status.Invalid)? Battery_Evidence.Invalid_Battery
          else if (value.indication == Battery_Indication.Adequate)? Battery_Evidence.Adequate_Battery
          else Battery_Evidence.Low_Battery;

      initialize
        // @trace INIT-01
        guarantee INITIAL_BATTERY_INVALID "Battery assessment starts in an explicitly untrusted state":
          battery_evidence_for_governor == Battery_Evidence.Invalid_Battery &
          battery_evidence_for_notice == Battery_Evidence.Invalid_Battery;

      compute
        // @trace QUAL-BATT-01
        guarantee BATTERY_ASSESSMENT_TOTAL "Both battery fields determine one assessment supplied to both distinct consumers":
          battery_evidence_for_governor == assess_battery(battery_sample) &
          battery_evidence_for_notice == assess_battery(battery_sample);
    }*/
  }

  // @trace PART-03
  part def Lifecycle_Governor :> Periodic_Rust_Thread {
    // @trace INT-02
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    // @trace INT-04
    port battery_evidence : DataPort { in :>> type : Battery_Evidence; }
    // @trace INT-06
    port charge_sample : DataPort { in :>> type : Charge_Connection_Sample; }
    // @trace INT-07
    port selected_phase : DataPort { out :>> type : Lifecycle_Phase; }
    // @trace INT-08
    port decision_disposition : DataPort { out :>> type : Decision_Disposition; }
    // @trace INT-10
    port commanded_phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    language "GUMBO" /*{
      // @trace OWNER-01
      state
        // @trace STATE-01
        current_phase: Lifecycle_Phase;
        // @trace STATE-01
        recovery_required: Base_Types::Boolean;

      functions
        // @trace QUAL-CHARGE-01
        def qualify_charge(value: Charge_Connection_Sample): Charge_Context :=
          if (value.status == Input_Status.Invalid)? Charge_Context.Invalid_Charge_Context
          else if (value.connection_state == Charge_Connection.Connected)? Charge_Context.Charge_Available
          else Charge_Context.Charge_Unavailable;

        // @trace PRIORITY-01
        def invalid_input(q: Qualified_Request, b: Battery_Evidence, c: Charge_Context): Base_Types::Boolean :=
          q == Qualified_Request.Invalid_Request |
          b == Battery_Evidence.Invalid_Battery |
          c == Charge_Context.Invalid_Charge_Context;

        // @trace CASE-05
        def switch_on_enabled(p: Lifecycle_Phase, q: Qualified_Request): Base_Types::Boolean :=
          p == Lifecycle_Phase.Off & q == Qualified_Request.Switch_On;

        // @trace CASE-06
        def begin_charge_enabled(p: Lifecycle_Phase, q: Qualified_Request, b: Battery_Evidence, c: Charge_Context): Base_Types::Boolean :=
          p == Lifecycle_Phase.Standby & q == Qualified_Request.Begin_Charge &
          b == Battery_Evidence.Low_Battery & c == Charge_Context.Charge_Available;

        // @trace CASE-07
        def end_charge_enabled(p: Lifecycle_Phase, q: Qualified_Request): Base_Types::Boolean :=
          p == Lifecycle_Phase.Charging & q == Qualified_Request.End_Charge;

        // @trace CASE-08
        def activate_enabled(p: Lifecycle_Phase, q: Qualified_Request, b: Battery_Evidence): Base_Types::Boolean :=
          p == Lifecycle_Phase.Standby & q == Qualified_Request.Activate &
          b == Battery_Evidence.Adequate_Battery;

        // @trace CASE-09
        def begin_flight_enabled(p: Lifecycle_Phase, q: Qualified_Request, b: Battery_Evidence): Base_Types::Boolean :=
          p == Lifecycle_Phase.Ready & q == Qualified_Request.Begin_Flight &
          b == Battery_Evidence.Adequate_Battery;

        // @trace CASE-10
        def end_flight_enabled(p: Lifecycle_Phase, q: Qualified_Request): Base_Types::Boolean :=
          p == Lifecycle_Phase.Flying & q == Qualified_Request.End_Flight;

        // @trace CASE-11
        def hold_reason(q: Qualified_Request, b: Battery_Evidence, c: Charge_Context): Rejection_Reason :=
          if (q == Qualified_Request.No_Request)? Rejection_Reason.No_Rejection
          else if (q == Qualified_Request.Begin_Charge & c == Charge_Context.Charge_Unavailable)? Rejection_Reason.Charger_Unavailable
          else if ((q == Qualified_Request.Activate | q == Qualified_Request.Begin_Flight) &
                   b == Battery_Evidence.Low_Battery)? Rejection_Reason.Battery_Insufficient
          else Rejection_Reason.Inapplicable;

      initialize
        // @trace INIT-01
        guarantee INITIAL_GOVERNOR_SAFE "The sole state and decision owner initializes safe state and outputs explicitly":
          current_phase == Lifecycle_Phase.Off &
          recovery_required == false &
          selected_phase == Lifecycle_Phase.Off &
          commanded_phase_report == Lifecycle_Phase.Off &
          decision_disposition.input_fault_detected == false &
          decision_disposition.recovery_pending == false &
          decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

      compute
        // @trace INVAR-01
        guarantee RECOVERY_IMPLIES_OFF "Every committed recovery state has commanded phase Off":
          (not recovery_required) | current_phase == Lifecycle_Phase.Off;

        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_INPUT "Any invalid qualified input commands Off and enters recovery":
            assume invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample));
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == true &
                      selected_phase == Lifecycle_Phase.Off &
                      commanded_phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == true &
                      decision_disposition.recovery_pending == true &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-02
          case CASE_02_BLOCK_PRESENT_REQUEST "A nonneutral request remains blocked while recovery is set":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   In(recovery_required) & qualified_request != Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == true &
                      selected_phase == Lifecycle_Phase.Off &
                      commanded_phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == true &
                      decision_disposition.rejection_reason == Rejection_Reason.Inapplicable;

          // @trace CASE-03
          case CASE_03_CLEAR_ON_NEUTRAL "One valid neutral request clears recovery while holding Off":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   In(recovery_required) & qualified_request == Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Off &
                      commanded_phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-04
          case CASE_04_GLOBAL_SWITCH_OFF "Valid SwitchOff has priority over all normal transition eligibility":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) & qualified_request == Qualified_Request.Switch_Off;
            guarantee current_phase == Lifecycle_Phase.Off &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Off &
                      commanded_phase_report == Lifecycle_Phase.Off &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-05
          case CASE_05_SWITCH_ON "SwitchOn from Off commands Standby":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) & switch_on_enabled(In(current_phase), qualified_request);
            guarantee current_phase == Lifecycle_Phase.Standby &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Standby &
                      commanded_phase_report == Lifecycle_Phase.Standby &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-06
          case CASE_06_BEGIN_CHARGE "Low battery and available charger evidence enable charging from Standby":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) &
                   begin_charge_enabled(In(current_phase), qualified_request, battery_evidence, qualify_charge(charge_sample));
            guarantee current_phase == Lifecycle_Phase.Charging &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Charging &
                      commanded_phase_report == Lifecycle_Phase.Charging &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-07
          case CASE_07_END_CHARGE "EndCharge from Charging commands Standby without asserting physical completion":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) & end_charge_enabled(In(current_phase), qualified_request);
            guarantee current_phase == Lifecycle_Phase.Standby &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Standby &
                      commanded_phase_report == Lifecycle_Phase.Standby &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-08
          case CASE_08_ACTIVATE "Adequate battery evidence enables Ready from Standby":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) & activate_enabled(In(current_phase), qualified_request, battery_evidence);
            guarantee current_phase == Lifecycle_Phase.Ready &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Ready &
                      commanded_phase_report == Lifecycle_Phase.Ready &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-09
          case CASE_09_BEGIN_FLIGHT "Adequate battery evidence enables commanded Flying from Ready":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) & begin_flight_enabled(In(current_phase), qualified_request, battery_evidence);
            guarantee current_phase == Lifecycle_Phase.Flying &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Flying &
                      commanded_phase_report == Lifecycle_Phase.Flying &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-10
          case CASE_10_END_FLIGHT "EndFlight from Flying commands Ready without asserting landing":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) & end_flight_enabled(In(current_phase), qualified_request);
            guarantee current_phase == Lifecycle_Phase.Ready &
                      recovery_required == false &
                      selected_phase == Lifecycle_Phase.Ready &
                      commanded_phase_report == Lifecycle_Phase.Ready &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == Rejection_Reason.No_Rejection;

          // @trace CASE-11
          case CASE_11_HOLD_OR_REJECT "Every remaining valid nonrecovery request holds phase with its exact reason":
            assume not invalid_input(qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not In(recovery_required) &
                   qualified_request != Qualified_Request.Switch_Off &
                   not switch_on_enabled(In(current_phase), qualified_request) &
                   not begin_charge_enabled(In(current_phase), qualified_request, battery_evidence, qualify_charge(charge_sample)) &
                   not end_charge_enabled(In(current_phase), qualified_request) &
                   not activate_enabled(In(current_phase), qualified_request, battery_evidence) &
                   not begin_flight_enabled(In(current_phase), qualified_request, battery_evidence) &
                   not end_flight_enabled(In(current_phase), qualified_request);
            guarantee current_phase == In(current_phase) &
                      recovery_required == false &
                      selected_phase == In(current_phase) &
                      commanded_phase_report == In(current_phase) &
                      decision_disposition.input_fault_detected == false &
                      decision_disposition.recovery_pending == false &
                      decision_disposition.rejection_reason == hold_reason(qualified_request, battery_evidence, qualify_charge(charge_sample));
    }*/
  }

  // @trace PART-04
  part def Enablement_Derivation :> Periodic_Rust_Thread {
    // @trace INT-07
    port selected_phase : DataPort { in :>> type : Lifecycle_Phase; }
    // @trace INT-09
    port lifecycle_enablement : DataPort { out :>> type : Lifecycle_Enablement; }

    language "GUMBO" /*{
      functions
        // @trace ENABLE-01
        def power_for(value: Lifecycle_Phase): Power_Permission :=
          if (value == Lifecycle_Phase.Off)? Power_Permission.Disabled
          else if (value == Lifecycle_Phase.Standby)? Power_Permission.Standby_Enabled
          else Power_Permission.Operational_Enabled;
        // @trace ENABLE-01
        def charging_for(value: Lifecycle_Phase): Base_Types::Boolean :=
          value == Lifecycle_Phase.Charging;
        // @trace ENABLE-01
        def flight_for(value: Lifecycle_Phase): Base_Types::Boolean :=
          value == Lifecycle_Phase.Flying;

      initialize
        // @trace INIT-01
        guarantee INITIAL_ENABLEMENT_DISABLED "Enablement starts with all logical permissions disabled":
          lifecycle_enablement.power == Power_Permission.Disabled &
          lifecycle_enablement.charging_permitted == false &
          lifecycle_enablement.flight_permitted == false;

      compute
        // @trace ENABLE-01
        guarantee ENABLEMENT_TOTAL "The selected phase determines three independently meaningful permission fields":
          lifecycle_enablement.power == power_for(selected_phase) &
          lifecycle_enablement.charging_permitted == charging_for(selected_phase) &
          lifecycle_enablement.flight_permitted == flight_for(selected_phase);
    }*/
  }

  // @trace PART-05
  part def Pilot_Notice_Derivation :> Periodic_Rust_Thread {
    // @trace INT-05
    port battery_evidence : DataPort { in :>> type : Battery_Evidence; }
    // @trace INT-08
    port decision_disposition : DataPort { in :>> type : Decision_Disposition; }
    // @trace INT-11
    port pilot_notice : DataPort { out :>> type : Pilot_Notice; }

    language "GUMBO" /*{
      functions
        // @trace NOTICE-01
        def notice_for(disposition: Decision_Disposition, battery: Battery_Evidence): Pilot_Notice :=
          if (disposition.input_fault_detected)? Pilot_Notice.Input_Fault
          else if (disposition.recovery_pending)? Pilot_Notice.Recovery_Awaiting_Neutral
          else if (disposition.rejection_reason == Rejection_Reason.Charger_Unavailable)? Pilot_Notice.Charger_Unavailable
          else if (battery == Battery_Evidence.Low_Battery)? Pilot_Notice.Low_Battery
          else if (disposition.rejection_reason != Rejection_Reason.No_Rejection)? Pilot_Notice.Request_Rejected
          else Pilot_Notice.None;

      initialize
        // @trace INIT-01
        guarantee INITIAL_NOTICE_NONE "Pilot notice initializes to None":
          pilot_notice == Pilot_Notice.None;

      compute
        // @trace NOTICE-01
        guarantee NOTICE_PRIORITY_TOTAL "Disposition and battery evidence determine the ordered pilot notice":
          pilot_notice == notice_for(decision_disposition, battery_evidence);
    }*/
  }

  // @generated-support SUPPORT-01 current HAMR Microkit requires one Thread per Process
  part def Request_Qualification_Process :> Process {
    // @trace PART-01
    part request_qualification : Request_Qualification;

    // @generated-support INT-01 inbound Process boundary port
    port request_sample : DataPort { in :>> type : Lifecycle_Request_Sample; }
    // @generated-support INT-02 outbound Process boundary port
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

    // @generated-support INT-01 Process-to-Thread delegation
    connection support_request_to_qualification : PortConnection
      connect request_sample to request_qualification.request_sample;
    // @generated-support INT-02 Thread-to-Process delegation
    connection support_qualified_request_to_process : PortConnection
      connect request_qualification.qualified_request to qualified_request;

    // @generated-support SUPPORT-01 Microkit protection-domain identifier
    attribute :>> Domain = 2;
  }

  // @generated-support SUPPORT-01 current HAMR Microkit requires one Thread per Process
  part def Battery_Evidence_Assessment_Process :> Process {
    // @trace PART-02
    part battery_evidence_assessment : Battery_Evidence_Assessment;

    // @generated-support INT-03 inbound Process boundary port
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    // @generated-support INT-04 outbound Process boundary port
    port battery_evidence_for_governor : DataPort { out :>> type : Battery_Evidence; }
    // @generated-support INT-05 outbound Process boundary port
    port battery_evidence_for_notice : DataPort { out :>> type : Battery_Evidence; }

    // @generated-support INT-03 Process-to-Thread delegation
    connection support_battery_to_assessment : PortConnection
      connect battery_sample to battery_evidence_assessment.battery_sample;
    // @generated-support INT-04 Thread-to-Process delegation
    connection support_battery_governor_to_process : PortConnection
      connect battery_evidence_assessment.battery_evidence_for_governor to battery_evidence_for_governor;
    // @generated-support INT-05 Thread-to-Process delegation
    connection support_battery_notice_to_process : PortConnection
      connect battery_evidence_assessment.battery_evidence_for_notice to battery_evidence_for_notice;

    // @generated-support SUPPORT-01 Microkit protection-domain identifier
    attribute :>> Domain = 3;
  }

  // @generated-support SUPPORT-01 current HAMR Microkit requires one Thread per Process
  part def Lifecycle_Governor_Process :> Process {
    // @trace PART-03
    part lifecycle_governor : Lifecycle_Governor;

    // @generated-support INT-02 inbound Process boundary port
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    // @generated-support INT-04 inbound Process boundary port
    port battery_evidence : DataPort { in :>> type : Battery_Evidence; }
    // @generated-support INT-06 inbound Process boundary port
    port charge_sample : DataPort { in :>> type : Charge_Connection_Sample; }
    // @generated-support INT-07 outbound Process boundary port
    port selected_phase : DataPort { out :>> type : Lifecycle_Phase; }
    // @generated-support INT-08 outbound Process boundary port
    port decision_disposition : DataPort { out :>> type : Decision_Disposition; }
    // @generated-support INT-10 outbound Process boundary port
    port commanded_phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    // @generated-support INT-02 Process-to-Thread delegation
    connection support_qualified_request_to_governor : PortConnection
      connect qualified_request to lifecycle_governor.qualified_request;
    // @generated-support INT-04 Process-to-Thread delegation
    connection support_battery_to_governor : PortConnection
      connect battery_evidence to lifecycle_governor.battery_evidence;
    // @generated-support INT-06 Process-to-Thread delegation
    connection support_charge_to_governor : PortConnection
      connect charge_sample to lifecycle_governor.charge_sample;
    // @generated-support INT-07 Thread-to-Process delegation
    connection support_selected_phase_to_process : PortConnection
      connect lifecycle_governor.selected_phase to selected_phase;
    // @generated-support INT-08 Thread-to-Process delegation
    connection support_disposition_to_process : PortConnection
      connect lifecycle_governor.decision_disposition to decision_disposition;
    // @generated-support INT-10 Thread-to-Process delegation
    connection support_phase_report_to_process : PortConnection
      connect lifecycle_governor.commanded_phase_report to commanded_phase_report;

    // @generated-support SUPPORT-01 Microkit protection-domain identifier
    attribute :>> Domain = 4;
  }

  // @generated-support SUPPORT-01 current HAMR Microkit requires one Thread per Process
  part def Enablement_Derivation_Process :> Process {
    // @trace PART-04
    part enablement_derivation : Enablement_Derivation;

    // @generated-support INT-07 inbound Process boundary port
    port selected_phase : DataPort { in :>> type : Lifecycle_Phase; }
    // @generated-support INT-09 outbound Process boundary port
    port lifecycle_enablement : DataPort { out :>> type : Lifecycle_Enablement; }

    // @generated-support INT-07 Process-to-Thread delegation
    connection support_selected_phase_to_enablement : PortConnection
      connect selected_phase to enablement_derivation.selected_phase;
    // @generated-support INT-09 Thread-to-Process delegation
    connection support_enablement_to_process : PortConnection
      connect enablement_derivation.lifecycle_enablement to lifecycle_enablement;

    // @generated-support SUPPORT-01 Microkit protection-domain identifier
    attribute :>> Domain = 5;
  }

  // @generated-support SUPPORT-01 current HAMR Microkit requires one Thread per Process
  part def Pilot_Notice_Derivation_Process :> Process {
    // @trace PART-05
    part pilot_notice_derivation : Pilot_Notice_Derivation;

    // @generated-support INT-05 inbound Process boundary port
    port battery_evidence : DataPort { in :>> type : Battery_Evidence; }
    // @generated-support INT-08 inbound Process boundary port
    port decision_disposition : DataPort { in :>> type : Decision_Disposition; }
    // @generated-support INT-11 outbound Process boundary port
    port pilot_notice : DataPort { out :>> type : Pilot_Notice; }

    // @generated-support INT-05 Process-to-Thread delegation
    connection support_battery_to_notice : PortConnection
      connect battery_evidence to pilot_notice_derivation.battery_evidence;
    // @generated-support INT-08 Process-to-Thread delegation
    connection support_disposition_to_notice : PortConnection
      connect decision_disposition to pilot_notice_derivation.decision_disposition;
    // @generated-support INT-11 Thread-to-Process delegation
    connection support_notice_to_process : PortConnection
      connect pilot_notice_derivation.pilot_notice to pilot_notice;

    // @generated-support SUPPORT-01 Microkit protection-domain identifier
    attribute :>> Domain = 6;
  }

  // @generated-support SUPPORT-01 Microkit scheduling resource
  part def Drone_Lifecycle_Processor :> Processor {
    attribute :>> Frame_Period = 1000[ms];
    attribute :>> Clock_Period = 1[ms];
  }

  // @trace BOUND-01
  part def Drone_Lifecycle_Governor_System :> System {
    // @generated-support SUPPORT-01 five one-Thread deployment wrappers required by Microkit codegen
    part request_qualification_process : Request_Qualification_Process;
    part battery_evidence_assessment_process : Battery_Evidence_Assessment_Process;
    part lifecycle_governor_process : Lifecycle_Governor_Process;
    part enablement_derivation_process : Enablement_Derivation_Process;
    part pilot_notice_derivation_process : Pilot_Notice_Derivation_Process;
    // @generated-support SUPPORT-01 processor required by Microkit deployment
    part lifecycle_processor : Drone_Lifecycle_Processor;

    // @trace MON-01
    port request_sample : DataPort { in :>> type : Lifecycle_Request_Sample; }
    // @trace MON-02
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    // @trace MON-03
    port charge_sample : DataPort { in :>> type : Charge_Connection_Sample; }
    // @trace CTRL-01
    port lifecycle_enablement : DataPort { out :>> type : Lifecycle_Enablement; }
    // @trace CTRL-02
    port commanded_phase_report : DataPort { out :>> type : Lifecycle_Phase; }
    // @trace CTRL-03
    port pilot_notice : DataPort { out :>> type : Pilot_Notice; }

    // @generated-support INT-01 System-to-Process delegation
    connection support_boundary_request : PortConnection
      connect request_sample to request_qualification_process.request_sample;
    // @trace INT-02
    connection qualified_request_to_governor : PortConnection
      connect request_qualification_process.qualified_request to lifecycle_governor_process.qualified_request;
    // @generated-support INT-03 System-to-Process delegation
    connection support_boundary_battery : PortConnection
      connect battery_sample to battery_evidence_assessment_process.battery_sample;
    // @trace INT-04
    connection battery_evidence_to_governor : PortConnection
      connect battery_evidence_assessment_process.battery_evidence_for_governor to lifecycle_governor_process.battery_evidence;
    // @trace INT-05
    connection battery_evidence_to_notice : PortConnection
      connect battery_evidence_assessment_process.battery_evidence_for_notice to pilot_notice_derivation_process.battery_evidence;
    // @generated-support INT-06 System-to-Process delegation
    connection support_boundary_charge : PortConnection
      connect charge_sample to lifecycle_governor_process.charge_sample;
    // @trace INT-07
    connection selected_phase_to_enablement : PortConnection
      connect lifecycle_governor_process.selected_phase to enablement_derivation_process.selected_phase;
    // @trace INT-08
    connection disposition_to_notice : PortConnection
      connect lifecycle_governor_process.decision_disposition to pilot_notice_derivation_process.decision_disposition;
    // @generated-support INT-09 Process-to-System delegation
    connection support_boundary_enablement : PortConnection
      connect enablement_derivation_process.lifecycle_enablement to lifecycle_enablement;
    // @generated-support INT-10 Process-to-System delegation
    connection support_boundary_phase_report : PortConnection
      connect lifecycle_governor_process.commanded_phase_report to commanded_phase_report;
    // @generated-support INT-11 Process-to-System delegation
    connection support_boundary_notice : PortConnection
      connect pilot_notice_derivation_process.pilot_notice to pilot_notice;

    // @generated-support SUPPORT-01 bind all one-Thread deployment wrappers to one processor
    allocation request_process_binding : Deployment_Properties::Actual_Processor_Binding
      allocate request_qualification_process to lifecycle_processor;
    allocation battery_process_binding : Deployment_Properties::Actual_Processor_Binding
      allocate battery_evidence_assessment_process to lifecycle_processor;
    allocation governor_process_binding : Deployment_Properties::Actual_Processor_Binding
      allocate lifecycle_governor_process to lifecycle_processor;
    allocation enablement_process_binding : Deployment_Properties::Actual_Processor_Binding
      allocate enablement_derivation_process to lifecycle_processor;
    allocation notice_process_binding : Deployment_Properties::Actual_Processor_Binding
      allocate pilot_notice_derivation_process to lifecycle_processor;
  }

  // @generated-support SUPPORT-01 common executable profile for all five behavior Threads
  part def Periodic_Rust_Thread :> Thread {
    attribute :>> Period = 1000[ms];
    attribute :>> Dispatch_Protocol = Supported_Dispatch_Protocols::Periodic;
    attribute :>> Implementation_Language = Implementation_Languages::Rust;
  }

  // @trace STRUCT-01
  part drone_lifecycle_governor : Drone_Lifecycle_Governor_System;
}
